package com.acner.api.integration.presentation.integration;


import com.acner.application.integration.ListIntegration;
import com.acner.client.integration.ItenIntegration;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ListAllIntegrationEndpoint {
    private final ListIntegration feature;

    public ListAllIntegrationEndpoint(ListIntegration feature) {
        this.feature = feature;
    }

    @GetMapping
    public ResponseEntity<List<ItenIntegration>> handle() {
        return ResponseEntity.ok(ViewerMapper.mapper(feature.execute()));
    }
}
