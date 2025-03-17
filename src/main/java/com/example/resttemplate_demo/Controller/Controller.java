package com.example.resttemplate_demo.Controller;

import com.example.resttemplate_demo.DTO.personInfo;
import com.example.resttemplate_demo.Service.PersonService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/")
@CrossOrigin(origins = "http://localhost:63342")
public class Controller {

    private final PersonService personService;

    public Controller(PersonService personService) {
        this.personService = personService;
    }


    @GetMapping("Person")
    public List<personInfo> person() {
        return personService.getPerson();
    }
}
