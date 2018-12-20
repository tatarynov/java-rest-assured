package com.nyt;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import support.props.GeneralProperties;
import support.reports.ExtentReportsListener;

@Listeners(ExtentReportsListener.class)
public abstract class Config {

    private static final Logger LOG = LoggerFactory.getLogger(Config.class);
    protected static final GeneralProperties CONFIG = GeneralProperties.getInstance();
    protected static final String API_KEY = GeneralProperties.getInstance().getApiKey();

    protected static final int ARTICLES_PER_PAGE = 20; // it's default value according to Times API Pagination


    @BeforeTest
    public void setUpEnvironment() {
        LOG.info("Setting up environment for tests");
        RestAssured.baseURI = CONFIG.getBaseUrl();
        RestAssured.basePath = CONFIG.getBasePath();
        RestAssured.requestSpecification = new RequestSpecBuilder()
                .addParam("api-key", API_KEY)
                .build();
        RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();
    }
}
