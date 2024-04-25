package com.sensedia.netsuite.integration.adapters.dto.collaborators;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;

import java.util.List;

@Builder
public record CollaboratorDTO(
        int id,
        String employee,
        String email,
        @JsonProperty("class")
        String classes,
        int employeeLevel,
        String supervisor,
        String title,
        boolean isJobResource,
        List<SkillsDTO> skills,
        List<TagsDTO> tags,
        ProjectsDTO projects
) {
}
