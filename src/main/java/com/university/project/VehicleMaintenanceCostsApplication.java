package com.university.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(CorsConfig.class)
public class VehicleMaintenanceCostsApplication {

    public static void main(String[] args) {
        SpringApplication.run(VehicleMaintenanceCostsApplication.class, args);
    }
}
