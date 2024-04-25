package com.sensedia.netsuite.integration.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("v1/skills")
public class SkillsController {

    @PostMapping
    public ResponseEntity<String> createSkill() {
        return ResponseEntity.created(null).body("Skill created");
    }

    @GetMapping
    public ResponseEntity<String> getSkills() {
        return ResponseEntity.ok("Skills");
    }

    @PostMapping("/{idSkill}/collaborator/{idCollaborator}")
    public ResponseEntity<String> setSkillToEmployee(@PathVariable String idSkill,
                                                     @PathVariable String idCollaborator) {
        return ResponseEntity.created(null).body("Skill to employee" + idSkill + idCollaborator);
    }

    @DeleteMapping("/{idSkill}/collaborator/{idCollaborator}")
    public ResponseEntity<String> removeSkillFromEmployee(@PathVariable String idSkill,
                                                          @PathVariable String idCollaborator) {
        return ResponseEntity.noContent().build();
    }
}
