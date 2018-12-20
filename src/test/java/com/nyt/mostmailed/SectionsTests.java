package com.nyt.mostmailed;

import com.nyt.Config;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static org.hamcrest.Matchers.is;
import static support.Endpoints.SECTIONS_ENDPOINT;

public class SectionsTests extends Config {

    private final Logger LOG = LoggerFactory.getLogger(SectionsTests.class);

    @Test(groups = {"P0", "Smoke", "Regression", "Sections"}, testName = "Sections Test",
            description = "Verify 'num_results' value")
    public void testSections() {
        LOG.info("Test ");
        when()
                .get(SECTIONS_ENDPOINT).
        then()
                .assertThat()
                .statusCode(200)
                .body("status", is("OK"));
    }
}
