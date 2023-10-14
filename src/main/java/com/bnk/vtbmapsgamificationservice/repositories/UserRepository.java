package com.bnk.vtbmapsgamificationservice.repositories;

import com.bnk.vtbmapsgamificationservice.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface UserRepository extends JpaRepository<User, Long> {

}
