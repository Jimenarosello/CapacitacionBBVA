package com.example.demo.domain;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import java.util.List;

@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class CurrentDTO {

    public String observationTime;
    public double temperature;
    public List<String> weatherIcons;
    public List<String> weatherDescriptions;

}
