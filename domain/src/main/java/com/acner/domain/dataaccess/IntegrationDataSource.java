package com.acner.domain.dataaccess;

import com.acner.domain.entities.Integration;

import java.util.List;

public interface IntegrationDataSource {
    List<Integration> getAll();
}
