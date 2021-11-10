package com.seensons.restapi.models;

import java.util.Calendar;
import java.util.Date;

/**
 * This class <description of functionality>
 *
 * @author jipderksen
 */
public class Day {
    private Date day;
    private int dayOfTheWeek;
    private int startTime;
    private int endTime;

    public Day(Date day) {
        this.day = day;
        this.setDateInfo();
    }

    private void setDateInfo() {
        Calendar c = Calendar.getInstance();
        c.setTime(day);
        this.dayOfTheWeek = c.get(Calendar.DAY_OF_WEEK) - 1;
        this.startTime = c.get(Calendar.HOUR_OF_DAY);
        this.endTime = this.startTime + 2;
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

    public int getStartTime() {
        return startTime;
    }

    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }

    public int getEndTime() {
        return endTime;
    }

    public void setEndTime(int endTime) {
        this.endTime = endTime;
    }
}
