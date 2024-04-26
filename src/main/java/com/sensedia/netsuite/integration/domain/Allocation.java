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
    private Long allocationId;

    @ManyToOne
    @JoinColumn(name = "collaborator_id", referencedColumnName = "collaborator_id", nullable = false)
    private Collaborator collaborator;

    @Column(name = "project")
    private Integer project;

    @Column(name = "alt_name")
    private String altName;

    @Column(name = "project_task")
    private Integer projectTask;

    @Column(name = "full_name")
    private String fullName;

    @Column(name = "start_date")
    private LocalDate startDate;

    @Column(name = "end_date")
    private LocalDate endDate;

    @Column(name = "number_hours")
    private Integer numberHours;

    @Column(name = "is_billable")
    private Boolean isBillable;

    @Column(name = "is_overhead")
    private Boolean isOverhead;

    @Column(name = "unit")
    @Enumerated(EnumType.STRING)
    private AllocationUnit unit;

    @Column(name = "percent_of_time")
    private Integer percentOfTime;

    @Column(name = "allocation_type")
    @Enumerated(EnumType.STRING)
    private AllocationType type;

    @Column(name = "is_active")
    private Boolean isActive;

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
