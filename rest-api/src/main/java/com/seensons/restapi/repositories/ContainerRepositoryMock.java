package com.seensons.restapi.repositories;

import com.seensons.restapi.models.Container;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * This class <description of functionality>
 *
 * @author jipderksen
 */

@Repository
public interface ContainerRepositoryMock extends MongoRepository<Container, Integer> {
    @Query("{'name':'?0'}")
    List<Container> findItemByName(String name);

    long count();
}
