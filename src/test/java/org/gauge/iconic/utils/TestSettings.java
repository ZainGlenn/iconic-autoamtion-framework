package org.gauge.iconic.utils;

import org.gauge.iconic.exception.IconicRuntimeException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;
import java.util.Properties;

public class TestSettings {

    private static final String COMMON_PROPERTIES_FILE_NAME = "common.properties";
    protected final Logger log = LoggerFactory.getLogger(this.getClass());
    private final Properties properties = new Properties();

    private TestSettings() {
        try {
            properties.putAll(loadProperties(getPropertiesFileName()));
            properties.putAll(loadProperties(COMMON_PROPERTIES_FILE_NAME));
            properties.putAll(loadSystemProperties());
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            throw new IconicRuntimeException(e.getMessage(), e);
        }
    }

    public static TestSettings getInstance() {
        return SingletonHolder.INSTANCE;
    }

    private Properties loadProperties(String propertiesFile) throws IOException {
        log.info("Loading properties for: [" + propertiesFile + "].");
        Properties properties = new Properties();
        InputStream resourceAsStream = TestSettings.class.getClassLoader().getResourceAsStream(propertiesFile);
        properties.load(Objects.requireNonNull(resourceAsStream));
        return properties;
    }

    private Properties loadSystemProperties() {
        log.info("Loading system properties:");
        return System.getProperties();
    }

    private String getPropertiesFileName() {
        String propertiesFile = System.getProperty("env.properties");
        if (propertiesFile == null) {
            propertiesFile = "default";
        }
        propertiesFile = propertiesFile + ".properties";
        return propertiesFile;
    }

    public String getProperty(String propertyName) {
        return properties.getProperty(propertyName);
    }

    private static class SingletonHolder {
        public static final TestSettings INSTANCE = new TestSettings();
    }


}
