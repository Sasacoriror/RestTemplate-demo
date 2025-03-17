package com.example.resttemplate_demo.Service;

import com.example.resttemplate_demo.DTO.personInfo;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class PersonService {

    private RestTemplate restTemplate;
    private ObjectMapper objectMapper;

    public PersonService(RestTemplate restTemplate, ObjectMapper objectMapper) {
        this.restTemplate = restTemplate;
        this.objectMapper = objectMapper;
    }

    public List<personInfo> getPerson() {
        ResponseEntity<personInfo[]> responseEntity = restTemplate.getForEntity("https://jsonplaceholder.typicode.com/users", personInfo[].class);


        return Arrays.asList(responseEntity.getBody());
    }
}
