package com.example.demo.services;

import com.example.demo.domain.Weather;
import com.example.demo.domain.WeatherResponseDTO;
import java.net.URI;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@Service
public class WeatherService {

    private static final String API_URL = "http://api.weatherstack.com";

    @Value("${api.key}")
    String apiKey;

    private final RestTemplate restTemplate = new RestTemplate();

    public Weather getCurrentWeatherIndicators(String city) {
        URI uri = UriComponentsBuilder
                .fromHttpUrl(API_URL)
                .path("current")
                .queryParam("access_key", apiKey)
                .queryParam("units", "m")
                .queryParam("query", city)
                .build()
                .toUri();

        WeatherResponseDTO responseDTO = restTemplate.getForEntity(uri, WeatherResponseDTO.class).getBody();

        return responseDTO.convertToWeather();
    }

}
