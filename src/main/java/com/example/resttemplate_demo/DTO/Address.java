package com.example.resttemplate_demo.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Address {

    @JsonProperty("street")
    private String street;

    @JsonProperty("city")
    private String city;

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
