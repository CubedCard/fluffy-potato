package com.seenons.wastebackend.repositories;

import com.seenons.wastebackend.models.Container;

import java.util.ArrayList;
import java.util.List;

/**
 * This class <description of functionality>
 *
 * @author jipderksen
 */
public class ContainerRepositoryMock implements ContainerRepository {
  private final List<Container> containers;
  public static int identifier = 1000;

  public ContainerRepositoryMock() {
    this.containers = new ArrayList<>();
    for (int i = 0; i < 5; i++) {
      this.containers.add(Container.createRandomContainer());
    }
  }

  @Override
  public List<Container> getAll() {
    return this.containers;
  }

  @Override
  public Container getContainerById(int id) {
    for (Container container : this.containers) {
      if (container.getId() == id) return container;
    }
    return null;
  }
}
