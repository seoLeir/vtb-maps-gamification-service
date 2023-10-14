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


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Embeddable
public class UserQuestKey implements Serializable {

    @Serial
    private static final long serialVersionUID = 123889132135L;

    @Column(name = "user_id")
    private Long userId;

    @Column(name = "quest_id")
    private Integer questId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserQuestKey that = (UserQuestKey) o;
        return Objects.equals(userId, that.userId) && Objects.equals(questId, that.questId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, questId);
    }

    @Override
    public String toString() {
        return "UserQuestId{" +
                "userId=" + userId +
                ", questId=" + questId +
                '}';
    }
}
