package com.emre.utillity;

import com.emre.service.JsonDataService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer implements CommandLineRunner {
    private final JsonDataService jsonDataService;

    public DataInitializer(JsonDataService jsonDataService) {
        this.jsonDataService = jsonDataService;
    }

    @Override
    public void run(String... args) throws Exception {
        jsonDataService.saveItemsFromJson();
    }
}
