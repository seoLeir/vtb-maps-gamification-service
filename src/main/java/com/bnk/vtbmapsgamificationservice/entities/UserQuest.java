package com.bnk.vtbmapsgamificationservice.entities;


import com.bnk.vtbmapsgamificationservice.entities.keys.UserQuestKey;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Objects;

@Table(name = "users_quests")
@Entity
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
public class UserQuest {

    @EmbeddedId
    UserQuestKey id;


    @MapsId("userId")
    @ManyToOne(fetch = FetchType.LAZY)
    User user;


    @MapsId("questId")
    @ManyToOne(fetch = FetchType.LAZY)
    Quest quest;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserQuest userQuest = (UserQuest) o;
        return Objects.equals(id, userQuest.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "UserQuest{" +
                "id=" + id +
                ", user=" + user +
                ", quest=" + quest +
                '}';
    }
}
