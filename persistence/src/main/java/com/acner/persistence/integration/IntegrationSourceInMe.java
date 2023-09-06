package com.acner.persistence.integration;

import com.acner.domain.dataaccess.IntegrationDataSource;
import com.acner.domain.entities.Integration;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class IntegrationSourceInMe implements IntegrationDataSource {
    private final List<Integration> integrations;

    public IntegrationSourceInMe(List<Integration> integrations) {
        this.integrations = integrations;
        integrations.add(Integration.create("12"));
        integrations.add(Integration.create("XP"));

    }

    @Override
    public List<Integration> getAll() {
        return integrations;
    }
}

