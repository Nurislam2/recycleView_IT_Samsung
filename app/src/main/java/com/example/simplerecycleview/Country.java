package com.example.simplerecycleview;

public class Country {
    String name;
    String image;
    String population;
    String capital;
    String timezone;

    public Country(String name, String image, String population, String capital, String timezone) {
        this.name = name;
        this.image = image;
        this.population = population;
        this.capital = capital;
        this.timezone = timezone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getPopulation() {
        return population;
    }

    public void setPopulation(String population) {
        this.population = population;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }
}
