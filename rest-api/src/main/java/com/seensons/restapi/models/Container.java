package com.seensons.restapi.models;

import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;
import java.util.ArrayList;
import java.util.List;

/**
 * This class <description of functionality>
 *
 * @author jipderksen
 */

@Document("Containers")
public class Container {
    public static int identifier = 1000;
    @Id
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

    public static Container createRandomContainer() {
        List<Type> types = List.of(Type.values());
        List<String> randomImages = new ArrayList<>();
        randomImages.add("https://www.google.com/url?sa=i&url=https%3A%2F%2Fseenons" +
                ".com%2F&psig=AOvVaw0RjgyPJL8p21IYq19oerIJ&ust=1636624687721000&source=images&cd=vfe&ved" +
                "=0CAsQjRxqFwoTCNjSl5vEjfQCFQAAAAAdAAAAABAD");
        randomImages.add("https://localhost:7777");
        randomImages.add("https://depindakaaswinkel.nl/");
        randomImages.add("https://bol.com");
        String[] names = {"Jip", "Dirk", "Piet", "Pieter", "Jan", "Adil", "Andre"};
        String[] descriptions = {
                "Hello there, I am a container",
                "This container is awesome",
                "What does a Spanish speaking person say when you ask him what is in his container full of snails?\n" +
                        "Es Cargo!",
                "How do you receive a cremation container\n" +
                        "You urn it"
        };
        return new Container(Container.identifier++, (int) Math.floor(Math.random() * 100 + 10),
                types.get((int) Math.floor(Math.random() * 2)), randomImages.subList(0,
                (int) (Math.random() * (randomImages.size()))),
                descriptions[(int) Math.floor(Math.random() * (descriptions.length))],
                names[(int) Math.floor(Math.random() * (names.length))], Math.random() > 0.5);
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
