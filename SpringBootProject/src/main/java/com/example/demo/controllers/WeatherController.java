package com.example.demo.controllers;

import com.example.demo.domain.Weather;
import com.example.demo.services.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/api/weather")
public class WeatherController {

    @Autowired
    public WeatherService weatherService;

    @GetMapping
    public String getCurrentWeather(@RequestParam String city, Model model) {
        Weather weather = weatherService.getCurrentWeatherIndicators(city);
        model.addAttribute("descriptions", weather.getDescriptions());
        model.addAttribute("icon", weather.getIcon());
        model.addAttribute("city", weather.getCity());
        model.addAttribute("temperature", weather.getTemperature());
        model.addAttribute("time", weather.getTime());
        return "weather";
    }

}
