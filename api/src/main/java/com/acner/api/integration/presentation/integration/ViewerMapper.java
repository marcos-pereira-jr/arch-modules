package com.acner.api.integration.presentation.integration;

import com.acner.client.integration.ItenIntegration;
import com.acner.domain.entities.Integration;

import java.util.List;
import java.util.stream.Collectors;

public class ViewerMapper {
    private ViewerMapper() {
    }

    public static List<ItenIntegration> mapper(List<Integration> integrations) {
        return integrations.stream().map(integration -> new ItenIntegration(integration.getNumber())).collect(Collectors.toList());
    }
}
