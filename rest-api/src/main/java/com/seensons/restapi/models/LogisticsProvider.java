package com.seensons.restapi.models;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

/**
 * This class <description of functionality>
 *
 * @author jipderksen
 */

@Document("LogisticsProviders")
public class LogisticsProvider {
    private String name;
    private List<Stream> stream;

    public LogisticsProvider(String name) {
        this.name = name;
        this.stream = new ArrayList<>();
        for (int i = 0; i < (int) Math.floor(Math.random() * 3) + 1; i++) {
            this.stream.add(Stream.createRandomStream());
        }
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

    public List<Stream> getStream() {
        return stream;
    }

    public void setStream(List<Stream> stream) {
        this.stream = stream;
    }
}
