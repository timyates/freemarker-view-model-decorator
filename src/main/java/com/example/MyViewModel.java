package com.example;

import io.micronaut.core.annotation.Introspected;

/**
 * A simple view model that contains a count and a date.
 * The count is set by the controller via the constructor, and the date string is set by the view model processor.
 */
@Introspected
@SuppressWarnings("unused")
public class MyViewModel {

    private final int count;
    private String date;

    public MyViewModel(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public String getDate() {
        return date == null ? "No date set" : date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
