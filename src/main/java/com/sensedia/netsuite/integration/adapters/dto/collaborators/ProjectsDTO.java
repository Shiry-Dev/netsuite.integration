package com.sensedia.netsuite.integration.adapters.dto.collaborators;

import java.util.List;

public record ProjectsDTO(
        List<CurrentClientDTO> currentClient,
        List<LastClientDTO> lastClient
) {
}

record CurrentClientDTO(
        String name
) {
}

record LastClientDTO(
        String name
) {
}
