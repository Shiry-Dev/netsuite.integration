package com.sensedia.netsuite.integration.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "collaborator_skill")
public class CollaboratorSkill implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "collaborator_skill_id")
    private int collaborator_skill_id;

    @ManyToOne
    @JoinColumn(name = "collaborator_id", referencedColumnName = "collaborator_id", nullable = false)
    private Collaborator collaborator;

    @ManyToOne
    @JoinColumn(name = "skill_id", referencedColumnName = "skill_id", nullable = false)
    private Skill skill;
}
