package com.example;

import jakarta.inject.Singleton;

import java.time.LocalDateTime;

@Singleton
public class MyDateServiceImpl implements MyDateService {

    @Override
    public String getDate() {
        return LocalDateTime.now().toString();
    }
}
