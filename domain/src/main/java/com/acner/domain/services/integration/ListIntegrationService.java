package com.acner.domain.services.integration;

import com.acner.domain.dataaccess.IntegrationDataSource;
import com.acner.domain.entities.Integration;

import java.util.List;

public class ListIntegrationService {
    private final IntegrationDataSource dataSource;

    public ListIntegrationService(IntegrationDataSource dataSource) {
        this.dataSource = dataSource;
    }

    public List<Integration> execute() {
        return dataSource.getAll();
    }
}
