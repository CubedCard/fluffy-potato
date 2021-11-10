package com.seensons.restapi.rest;

import com.seensons.restapi.models.Container;
import com.seensons.restapi.repositories.ContainerRepositoryMock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * This class <description of functionality>
 *
 * @author jipderksen
 */

@RestController
public class ContainerController {

    @Autowired
    private ContainerRepositoryMock repository;

    @GetMapping("containers")
    public List<Container> getAllContainers() {
        return repository.findAll();
    }

    @PostMapping("create")
    public void createContainer() {
        repository.save(Container.createRandomContainer());
    }

    @GetMapping("/test")
    public String getTest() {
        return "Hi there";
    }
}
