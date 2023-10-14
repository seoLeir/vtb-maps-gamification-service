package com.bnk.vtbmapsgamificationservice.entities;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
@NoArgsConstructor
@Table(name="quests")
public class Quest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    Long exp;

    String text;

    @OneToMany(fetch = FetchType.LAZY)
    UserQuest userQuest;

    @OneToMany(fetch = FetchType.LAZY)
    DepartmentQuest departmentQuest;

    @Override
    public String toString() {
        return "Quest{" +
                "id=" + id +
                ", exp=" + exp +
                ", text='" + text + '\'' +
                '}';
    }
}
