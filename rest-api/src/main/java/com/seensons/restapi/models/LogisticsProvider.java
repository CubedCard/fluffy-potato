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

    public LogisticsProvider(String name) {
        this.name = name;
        this.stream = Stream.createRandomStream();
    }

    public static LogisticsProvider createRandomLogisticsProvider() {
        String[] names = {
                "Retransport",
                "GreenCollect",
                "L&L Logistics",
                "IllPickUpYourTrash",
        };
        return new LogisticsProvider(names[(int) Math.floor(Math.random() * (names.length))]);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Stream getStream() {
        return stream;
    }

    public void setStream(Stream stream) {
        this.stream = stream;
    }
}
