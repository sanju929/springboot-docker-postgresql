package com.das.spring_boot_docker_postgresql.controller;

import com.das.spring_boot_docker_postgresql.model.Test;
import com.das.spring_boot_docker_postgresql.repository.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private TestRepository testRepository;
    @GetMapping("/hello")
    public String hello() {
        Test test= new Test();
        test.setTestName("sk-docker");
        testRepository.save(test);
        return "Hello, World!";
    }
}
