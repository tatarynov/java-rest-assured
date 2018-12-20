package support.props;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Objects;
import java.util.Properties;

import static java.lang.System.getProperty;
import static support.props.Properties.*;

public class GeneralProperties {

    private Properties props = new Properties();
    private String apiKey;
    private String baseUrl;
    private String basePath;

    private static GeneralProperties instance;

    private final static String CONFIG_FILE = "nyapi.properties";
    private final static Logger LOG = LoggerFactory.getLogger(GeneralProperties.class);


    private GeneralProperties() {
        InputStream inputStream;
        try {
            String resource = Objects.requireNonNull(Thread.currentThread().getContextClassLoader().getResource(CONFIG_FILE)).getPath();
            inputStream = new FileInputStream(resource);
            props.load(inputStream);

            apiKey = getPropValue(API_KEY);
            baseUrl = getPropValue(SERVER_HOST);
            basePath = getPropValue(SERVER_BASE);
        } catch (java.io.IOException e) {
            e.printStackTrace();
            LOG.error("Configuration file is not found!");
        }
    }

    private String getPropValue(String propName) {
        return getProperty(propName, "").isEmpty() ? props.getProperty(propName) : getProperty(propName);
    }

    public static GeneralProperties getInstance() {
        if (instance == null) instance = new GeneralProperties();
        return instance;
    }

    public String getApiKey() {
        return apiKey;
    }

    public String getBaseUrl() {
        return baseUrl;
    }

    public String getBasePath() {
        return basePath;
    }
}
