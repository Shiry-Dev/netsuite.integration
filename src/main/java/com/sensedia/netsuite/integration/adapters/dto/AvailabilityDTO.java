package com.sensedia.netsuite.integration.adapters.dto;

public record AvailabilityDTO(
        int idCollaborator,
        AvailabilitiesDTO availabilities
) {
}

record AvailabilitiesDTO(
        String period,
        int availability,
        boolean isOverHead
) {
}
