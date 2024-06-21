package com.example;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.views.View;

import java.util.concurrent.atomic.AtomicInteger;

@Controller
public class MyController {

    private final AtomicInteger counter = new AtomicInteger(1);

    @Get
    @View("home")
    MyViewModel index() {
        return new MyViewModel(counter.getAndIncrement());
    }
}
