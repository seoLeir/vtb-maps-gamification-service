package com.bnk.vtbmapsgamificationservice.entities.keys;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class DepartmentQuestKey implements Serializable {
    @Serial
    private static final long serialVersionUID = 487863211454645L;

    @Column(name = "department_id")
    private Long departmentId;


    @Column(name = "quest_id")
    private Long questId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DepartmentQuestKey that = (DepartmentQuestKey) o;
        return Objects.equals(departmentId, that.departmentId) && Objects.equals(questId, that.questId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(departmentId, questId);
    }

    @Override
    public String toString() {
        return "DepartmentQuestKey{" +
                "departmentId=" + departmentId +
                ", questId=" + questId +
                '}';
    }
}
