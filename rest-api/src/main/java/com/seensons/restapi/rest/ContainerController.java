package com.seensons.restapi.rest;

import com.seensons.restapi.models.Container;
import com.seensons.restapi.repositories.ContainerRepositoryMock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
        return this.repository.findAll();
    }

    @PostMapping("containers")
    public Container createContainer() {
        return this.repository.save(Container.createRandomContainer());
    }

    @GetMapping("containers/{name}")
    public List<Container> getContainerByName(@PathVariable String name) {
        return this.repository.findItemByName(name);
    }

    @DeleteMapping("containers")
    private void deleteAllContainers() {
        this.repository.deleteAll();
    }
}
