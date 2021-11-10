package com.seensons.restapi.rest;

import com.seensons.restapi.models.LogisticsProvider;
import com.seensons.restapi.repositories.LogisticsProviderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * This class <description of functionality>
 *
 * @author jipderksen
 */

@RestController
public class LogisticsProviderController {
    @Autowired
    private LogisticsProviderRepository repository;

    @GetMapping("providers")
    public List<LogisticsProvider> getAllLogisticsProviders() {
        return this.repository.findAll();
    }

    @GetMapping("providers/{postalCode}")
    public List<LogisticsProvider> getByPostalCode(@PathVariable int postalCode) {
        return this.repository.findByLocation(postalCode);
    }

    @PostMapping("providers")
    public LogisticsProvider createLogisticsProvider() {
        return this.repository.save(LogisticsProvider.createRandomLogisticsProvider());
    }

    @DeleteMapping("providers")
    private void deleteAllLogisticsProviders() {
        this.repository.deleteAll();
    }
}
