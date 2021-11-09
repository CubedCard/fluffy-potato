package com.seenons.wastebackend.repositories;

import com.seenons.wastebackend.models.Container;

import java.util.List;

public interface ContainerRepository {
  List<Container> getAll();           // returns all the containers
  Container getContainerById(int id); // returns the container with the given id
}
