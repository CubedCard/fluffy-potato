package com.seenons.wastebackend.rest;

import com.seenons.wastebackend.models.Container;
import com.seenons.wastebackend.repositories.ContainerRepository;
import com.seenons.wastebackend.repositories.ContainerRepositoryMock;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * This class controls the call to the API
 *
 * @author jipderksen
 */

@RestController
public class ApiController {
  private final ContainerRepository repository = new ContainerRepositoryMock();

  @GetMapping("/containers")
  public List<Container> getAllContainers() {
    return this.repository.getAll();
  }

  @GetMapping("containers/{id}")
  public Container getContainer(@PathVariable int id) {
    return this.repository.getContainerById(id);
  }
}
