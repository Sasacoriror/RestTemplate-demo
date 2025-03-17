package com.example.resttemplate_demo.DTO;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class personInfo {

    @JsonProperty("name")
    private String name;
}
