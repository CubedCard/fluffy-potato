package com.seenons.wastebackend.models;

import java.util.List;

/**
 * This class <description of functionality>
 *
 * @author jipderksen
 */
public class Container {
  private int id;
  private int size;
  private Type type;
  private List<String> images;
  private String description;
  private String name;
  private boolean active;

  public Container(int id, int size, Type type, List<String> images, String description, String name, boolean active) {
    this.id = id;
    this.size = size;
    this.type = type;
    this.images = images;
    this.description = description;
    this.name = name;
    this.active = active;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public int getSize() {
    return size;
  }

  public void setSize(int size) {
    this.size = size;
  }

  public Type getType() {
    return type;
  }

  public void setType(Type type) {
    this.type = type;
  }

  public List<String> getImages() {
    return images;
  }

  public void setImages(List<String> images) {
    this.images = images;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public boolean isActive() {
    return active;
  }

  public void setActive(boolean active) {
    this.active = active;
  }
}
