package com.seensons.restapi.models;

/**
 * This class <description of functionality>
 *
 * @author jipderksen
 */
public class Range {
    private int from;
    private int to;

    public Range(int from, int to) {
        this.to = Math.max(from, to);
        this.from = from;
    }

    public boolean contains(int number) {
        return (from <= number && number <= to);
    }
}
