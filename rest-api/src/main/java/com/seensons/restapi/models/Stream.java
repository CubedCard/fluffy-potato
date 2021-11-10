package com.seensons.restapi.models;

import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;
import java.util.*;

/**
 * This class <description of functionality>
 *
 * @author jipderksen
 */

@Document("Streams")
public class Stream {
    public static int identifier = 0;
    @Id
    private int stream_product_id;
    private List<Container> sizes;
    private String type;
    private double weight;
    private String description;
    private String name;
    private List<Day> days;
    private Range postalCodeRange;

    public Stream(int stream_product_id, List<Container> sizes, String type, double weight, String description,
                  String name, List<Day> days, Range postalCodeRange) {
        this.stream_product_id = stream_product_id;
        this.sizes = sizes;
        this.type = type;
        this.weight = weight;
        this.description = description;
        this.name = name;
        this.days = days;
        this.postalCodeRange = postalCodeRange;
    }

    public static Stream createRandomStream() {
        List<Container> randomContainers = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            randomContainers.add(Container.createRandomContainer());
        }
        String[] types = {
                "glass",
                "paper",
                "cardboard",
                "GFT",
                "residual waste",
                "swill",
                "confidential paper"
        };
        String[] descriptions = {
                "do not look inside",
                "it's trash!",
                "You know there's no official training for trash collectors?\n" +
                        "They just pick things up as they go along",
                "This smells",
                "Ever feel useless.... Just remember we buy trash bags just to throw it away"
        };
        String[] names = {
                "Glass",
                "Paper",
                "Cardboard",
                "GFT",
                "Residual waste",
                "Swill",
                "Confidential paper"
        };
        Date date = new GregorianCalendar(2021, Calendar.NOVEMBER, (int) Math.floor(Math.random() * 30)).getTime();
        date.setHours((int) Math.floor(Math.random() * 10) + 8);
        List<Day> days1 = new ArrayList<>();
        days1.add(new Day(date));
        return new Stream(
                Stream.identifier++,
                randomContainers,
                types[(int) Math.floor(Math.random() * types.length)],
                Math.floor(Math.random() * 100),
                descriptions[(int) Math.floor(Math.random() * descriptions.length)],
                names[(int) Math.floor(Math.random() * names.length)],
                new ArrayList<>(days1),
                new Range((int) Math.floor(Math.random() * 1500) + 1000, (int) Math.floor(Math.random() * 1500 + 1100))
        );
    }

    public int getStream_product_id() {
        return stream_product_id;
    }

    public void setStream_product_id(int stream_product_id) {
        this.stream_product_id = stream_product_id;
    }

    public List<Container> getSizes() {
        return sizes;
    }

    public void setSizes(List<Container> sizes) {
        this.sizes = sizes;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Day> getDays() {
        return days;
    }

    public void setDays(List<Day> days) {
        this.days = days;
    }

    public Range getPostalCodeRange() {
        return postalCodeRange;
    }

    public void setPostalCodeRange(Range postalCodeRange) {
        this.postalCodeRange = postalCodeRange;
    }
}
