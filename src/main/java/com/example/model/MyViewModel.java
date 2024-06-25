package com.example.model;

import io.micronaut.core.annotation.Introspected;

/**
 * A simple view model that contains some other model (that extends MyModelTypes) and a date.
 * The count is set by the controller via the constructor, and the date string is set by the view model processor.
 */
@Introspected
@SuppressWarnings("unused")
public class MyViewModel<T extends MyModelTypes> {

    private final T model;
    private String date;

    public MyViewModel(T model) {
        this.model = model;
    }

    public T getModel() {
        return model;
    }

    public String getDate() {
        return date == null ? "No date set" : date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public static <T extends MyModelTypes> MyViewModel<T> of(T model) {
        return new MyViewModel<>(model);
    }
}
