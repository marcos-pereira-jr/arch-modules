package com.acner.application.integration;

import com.acner.domain.entities.Integration;
import com.acner.domain.services.integration.ListIntegrationService;

import java.util.List;

public class ListIntegration {
    private final ListIntegrationService service;

    public ListIntegration(ListIntegrationService service) {
        this.service = service;
    }

    public List<Integration> execute() {
        return service.execute();
    }
}
