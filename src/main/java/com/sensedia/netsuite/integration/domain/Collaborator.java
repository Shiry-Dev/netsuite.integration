package com.sensedia.netsuite.integration.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "collaborator")
public class Collaborator implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "collaborator_id")
    private Long collaboratorId;

    @Column(name = "employee")
    private String employee;

    @Column(name = "email")
    private String email;

    @Column(name = "class")
    private Byte classes;

    @Column(name = "employee_level")
    private Byte employeeLevel;

    @Column(name = "supervisor_id")
    private Integer supervisorId;

    @Column(name = "title")
    private String title;

    @Column(name = "is_job_resource")
    private Boolean isJobResource;

    @OneToMany(mappedBy = "collaborator", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<Allocation> allocations;

    @OneToMany(mappedBy = "collaborator", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<CollaboratorSkill> collaboratorSkills;

    @OneToMany(mappedBy = "collaborator", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<CollaboratorTag> collaboratorTags;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Collaborator that = (Collaborator) o;
        return collaboratorId == that.collaboratorId && Objects.equals(email, that.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(collaboratorId, email);
    }

    @Override
    public String toString() {
        return "Collaborator{" +
                "id=" + collaboratorId +
                ", employee='" + employee + '\'' +
                ", email='" + email + '\'' +
                ", classes=" + classes +
                ", employeeLevel=" + employeeLevel +
                ", supervisorId=" + supervisorId +
                ", title='" + title + '\'' +
                ", isJobResource=" + isJobResource +
                '}';
    }
}
