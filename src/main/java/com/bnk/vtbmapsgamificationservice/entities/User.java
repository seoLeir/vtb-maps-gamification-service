package com.bnk.vtbmapsgamificationservice.entities;

import com.bnk.vtbmapsgamificationservice.entities.keys.UserQuestKey;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
@NoArgsConstructor
@Table(name="users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name = "jwt_token")
    String jwtToken;

    @OneToMany(fetch = FetchType.LAZY)
    UserQuest userQuest;
}
