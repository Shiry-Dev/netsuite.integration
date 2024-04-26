package com.sensedia.netsuite.integration.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "allocation")
public class Allocation implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "allocation_id")
    private int allocationId;

    @ManyToOne
    @JoinColumn(name = "collaborator_id", referencedColumnName = "collaborator_id", nullable = false)
    private Collaborator collaborator;

    @Column(name = "project")
    private int project;

    @Column(name = "alt_name")
    private String altName;

    @Column(name = "project_task")
    private int projectTask;

    @Column(name = "full_name")
    private String fullName;

    @Column(name = "start_date")
    private LocalDate startDate;

    @Column(name = "end_date")
    private LocalDate endDate;

    @Column(name = "number_hours")
    private int numberHours;

    @Column(name = "is_billable")
    private boolean isBillable;

    @Column(name = "is_overhead")
    private boolean isOverhead;

    @Column(name = "unit")
    private AllocationUnit unit;

    @Column(name = "percent_of_time")
    private int percentOfTime;

    @Column(name = "type")
    private AllocationType type;

    @Column(name = "is_active")
    private boolean isActive;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Allocation that = (Allocation) o;
        return allocationId == that.allocationId;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(allocationId);
    }

    @Override
    public String toString() {
        return "Allocation{" +
                "collaboratorId=" + collaborator +
                ", allocationId=" + allocationId +
                '}';
    }
}
