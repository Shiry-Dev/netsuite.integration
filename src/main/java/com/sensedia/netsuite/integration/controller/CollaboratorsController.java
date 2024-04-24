package com.sensedia.netsuite.integration.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/collaborators")
public class CollaboratorsController {

    @GetMapping
    public ResponseEntity<String> getCollaborators() {
        return ResponseEntity.ok("Collaborators");
    }

    @GetMapping("/employee-level")
    public ResponseEntity<String> getEmployeeLevel() {
        return ResponseEntity.ok("Employee Level");
    }

    @GetMapping("/titles")
    public ResponseEntity<String> getTitles() {
        return ResponseEntity.ok("Titles");
    }

    @GetMapping("/availability/{idCollaborator}")
    public ResponseEntity<String> getAvalilability(@PathVariable String idCollaborator) {
        return ResponseEntity.ok("Availability" + idCollaborator);
    }
}
