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
    private Date day;
    private int dayOfTheWeek;
    private long startTime;
    private long endTime;
    private Range postalCodeRange;

    public Stream(int stream_product_id, List<Container> sizes, String type, double weight, String description,
                  String name, Date day, Range postalCodeRange) {
        this.stream_product_id = stream_product_id;
        this.sizes = sizes;
        this.type = type;
        this.weight = weight;
        this.description = description;
        this.name = name;
        this.day = day;
        Calendar c = Calendar.getInstance();
        c.setTime(day);
        this.dayOfTheWeek = c.get(Calendar.DAY_OF_WEEK) - 1;
        this.startTime = day.getTime();
        this.endTime = this.startTime + 2;
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
        return new Stream(
                Stream.identifier++,
                randomContainers,
                types[(int) Math.floor(Math.random() * types.length)],
                Math.floor(Math.random() * 100),
                descriptions[(int) Math.floor(Math.random() * descriptions.length)],
                names[(int) Math.floor(Math.random() * names.length)],
                date,
                new Range((int) Math.floor(Math.random() * 1500), (int) Math.floor(Math.random() * 1500 + 100))
        );
    }

    public static int getIdentifier() {
        return identifier;
    }

    public static void setIdentifier(int identifier) {
        Stream.identifier = identifier;
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

    public Date getDay() {
        return day;
    }

    public void setDay(Date day) {
        this.day = day;
    }

    public int getDayOfTheWeek() {
        return dayOfTheWeek;
    }

    public void setDayOfTheWeek(int dayOfTheWeek) {
        this.dayOfTheWeek = dayOfTheWeek;
    }

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

    public Range getPostalCodeRange() {
        return postalCodeRange;
    }

    public void setPostalCodeRange(Range postalCodeRange) {
        this.postalCodeRange = postalCodeRange;
    }
}
