package com.nyt.mostmailed;

import com.nyt.Config;
import dto.Article;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.assertj.core.api.Assertions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

import static enums.Section.ALL_SECTIONS;
import static enums.TimePeriod.DAY;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;
import static support.Endpoints.MOSTEMAILED_ENDPOINT;

public class OffsetTest extends Config {

    private final static Logger LOG = LoggerFactory.getLogger(OffsetTest.class);
    private RequestSpecification requestSpecification;

    @BeforeClass
    public void setUp() {
        requestSpecification = given()
                .pathParam("section", ALL_SECTIONS.getValue())
                .pathParam("time-period", DAY.getValue())
                .param("offset", ARTICLES_PER_PAGE);
    }


    @Test(groups = {"P0", "Smoke", "Regression", "Most Mailed"}, testName = "Test for offset value",
            description = "Verify 'num_results' value")
    public void offsetTest() {
        LOG.info("Getting total number of articles");
        Response response = requestSpecification.get(MOSTEMAILED_ENDPOINT);
        response.
                then()
                .assertThat()
                .statusCode(200)
                .body("status", is("OK"));

        LOG.info("Saving response as list of article DTO");
        List<Article> results = response
                .getBody()
                .jsonPath()
                .getList("results", Article.class);
        Assertions.assertThat(results.size())
                .as("Size of articles on page equals offset")
                .isEqualTo(ARTICLES_PER_PAGE);
    }
}