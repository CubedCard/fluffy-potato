package com.seensons.restapi.repositories;

import com.seensons.restapi.models.LogisticsProvider;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LogisticsProviderRepository extends MongoRepository<LogisticsProvider, Integer> {
    @Query("{ $and: [{\"stream.postalCodeRange.from\": { $lt: ?0 }}, {\"stream.postalCodeRange.to\": { $gt: ?0 " +
            "}}]}")
    List<LogisticsProvider> findByLocation(int postalCode);
}
