package com.example;

import io.micronaut.core.annotation.NonNull;
import io.micronaut.http.HttpRequest;
import io.micronaut.views.ModelAndView;
import io.micronaut.views.model.ViewModelProcessor;
import jakarta.inject.Singleton;

/**
 * Each request when we pass through the ModelAndViewRenderer, this processor will be called if the Model is a ViewModel.
 */
@Singleton
public class MyViewModelProcessor implements ViewModelProcessor<MyViewModel> {

    private final MyDateService myDateService;

    public MyViewModelProcessor(MyDateService myDateService) {
        this.myDateService = myDateService;
    }

    @Override
    public void process(@NonNull HttpRequest<?> request, @NonNull ModelAndView<MyViewModel> modelAndView) {
        modelAndView.getModel().ifPresent(m ->
                m.setDate(myDateService.getDate())
        );
    }
}
