package com.bnk.vtbmapsgamificationservice.entities;

import com.bnk.vtbmapsgamificationservice.entities.keys.DepartmentQuestKey;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Objects;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "departments_quests")
@Entity
public class DepartmentQuest {

    @EmbeddedId
    private DepartmentQuestKey id;

    @MapsId("departmentId")
    @ManyToOne
    private Department department;

    @MapsId("questId")
    @ManyToOne
    private Quest quest;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DepartmentQuest that = (DepartmentQuest) o;
        return Objects.equals(id, that.id) && Objects.equals(department, that.department) && Objects.equals(quest, that.quest);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, department, quest);
    }
}
