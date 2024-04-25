package com.sensedia.netsuite.integration.adapters.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("v1/tags")
public class TagsController {

    @PostMapping
    public ResponseEntity<String> createTag(@RequestBody String description) {
        return ResponseEntity.created(null).body("Tag created");
    }

    @GetMapping
    public ResponseEntity<String> getTag() {
        return ResponseEntity.ok("Tags");
    }

    @PostMapping("/{idTag}/collaborator/{idCollaborator}")
    public ResponseEntity<String> setTagToEmployee(@PathVariable String idTag,
                                                   @PathVariable String idCollaborator) {
        return ResponseEntity.created(null).body("Tag to employee" + idTag + idCollaborator);
    }

    @DeleteMapping("/{idTag}/collaborator/{idCollaborator}")
    public ResponseEntity<String> removeTagFromEmployee(@PathVariable String idTag,
                                                        @PathVariable String idCollaborator) {
        return ResponseEntity.noContent().build();
    }
}
