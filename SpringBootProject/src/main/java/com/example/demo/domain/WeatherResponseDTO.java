package com.example.demo.domain;

public class WeatherResponseDTO {
    public RequestDTO request;
    public CurrentDTO current;

    public Weather convertToWeather() {
        Weather weather = new Weather();
        weather.setCity(this.request.query);
        weather.setDescriptions(String.join(", ", this.current.weatherDescriptions));
        weather.setIcons(this.current.weatherIcons.stream().findFirst().orElse(""));
        weather.setTemperature(this.current.temperature);
        weather.setTime(this.current.observationTime);

        return weather;
    }

}
