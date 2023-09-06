package com.acner.api.integration.configuration;

import com.acner.application.integration.ListIntegration;
import com.acner.domain.dataaccess.IntegrationDataSource;
import com.acner.domain.services.integration.ListIntegrationService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class IntegrationConfiguration {
    @Bean
    public ListIntegration listIntegration(IntegrationDataSource integrationDataSource) {
        ListIntegrationService service = new ListIntegrationService(integrationDataSource);
        return new ListIntegration(service);
    }
}
