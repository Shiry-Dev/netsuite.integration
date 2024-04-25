package com.sensedia.netsuite.integration.adapters.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.time.LocalDate;

@RestController
@RequestMapping("v1/collaborators")
public class CollaboratorsController {

    @GetMapping
    public ResponseEntity<String> getCollaborators(@RequestHeader(value = "page", defaultValue = "1", required = false) Integer page,
                                                   @RequestHeader(value = "pageSize", defaultValue = "50", required = false) Integer pageSize,
                                                   @RequestParam(value = "startDate") LocalDate startDate,
                                                   @RequestParam(value = "endDate") LocalDate endDate,
                                                   @RequestParam(value = "email-collaborator") String emailCollaborator,
                                                   @RequestParam(value = "idSkill") int idSkill,
                                                   @RequestParam(value = "employee-level") int employeeLevel,
                                                   @RequestParam(value = "title") String title,
                                                   @RequestParam(value = "name") String name) {
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
    public ResponseEntity<String> getAvalilability(@PathVariable String idCollaborator,
                                                   @RequestParam(value = "startDate") LocalDate startDate,
                                                   @RequestParam(value = "endDate") LocalDate endDate) {
        return ResponseEntity.ok("Availability" + idCollaborator);
    }
}
