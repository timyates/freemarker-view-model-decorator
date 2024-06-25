package com.example;

import com.example.model.CounterModel;
import com.example.model.MyViewModel;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.views.View;

import java.util.concurrent.atomic.AtomicInteger;

@Controller
public class MyController {

    private final AtomicInteger counter = new AtomicInteger(1);

    @Get
    @View("home")
    MyViewModel<CounterModel> index() {
        return MyViewModel.of(new CounterModel(counter.getAndIncrement()));
    }
}
