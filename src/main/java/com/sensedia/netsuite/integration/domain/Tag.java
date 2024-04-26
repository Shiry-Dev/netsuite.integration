package com.sensedia.netsuite.integration.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "tag")
public class Tag implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tag_id")
    private int tagId;

    @Column(name = "description")
    private String description;

    @OneToMany(mappedBy = "tag", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<CollaboratorTag> collaboratorTags;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tag tag = (Tag) o;
        return tagId == tag.tagId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(tagId);
    }

    @Override
    public String toString() {
        return "Tag{" +
                "tagId=" + tagId +
                ", description='" + description + '\'' +
                '}';
    }
}
