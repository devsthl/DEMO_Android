package com.example.weather;

public class WeatherEntity {
    private int image; //ảnh
    private String country; //tên thành phố
    private String descriptions; //miêu tả
    private int celsius; //nhiệt độ

    public WeatherEntity(int image, String country, String descriptions, int celsius) {
        this.image = image;
        this.country = country;
        this.descriptions = descriptions;
        this.celsius = celsius;
    }

    public WeatherEntity() {
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    public int getCelsius() {
        return celsius;
    }

    public void setCelsius(int celsius) {
        this.celsius = celsius;
    }
}
