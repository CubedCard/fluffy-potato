package com.seensons.restapi.models;

import org.springframework.data.mongodb.core.mapping.Document;

/**
 * This class <description of functionality>
 *
 * @author jipderksen
 */

@Document("LogisticsProviders")
public class LogisticsProvider {
    private String name;
    private Stream stream;
}
