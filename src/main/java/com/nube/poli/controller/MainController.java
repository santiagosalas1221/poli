package com.nube.poli.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MainController {

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("/users")
    public List<Object> test() {

        ResponseEntity<List<Object> > user_body = restTemplate.exchange("https://controlingreso.tuturno.store/controlingreso/api/registro/Login",
                HttpMethod.POST, null, new ParameterizedTypeReference<List<Object>>() {});

        return user_body.getBody();

    }

}
