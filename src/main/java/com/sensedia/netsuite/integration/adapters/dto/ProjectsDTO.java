package com.sensedia.netsuite.integration.adapters.dto;

import java.util.List;

public record ProjectsDTO(
        String currentClient,
        List<LastClientDTO> lastClient
) {
}

record LastClientDTO(
        String name
) {
}
