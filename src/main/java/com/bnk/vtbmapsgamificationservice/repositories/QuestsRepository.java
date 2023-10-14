package com.bnk.vtbmapsgamificationservice.repositories;

import com.bnk.vtbmapsgamificationservice.entities.Quest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestsRepository extends JpaRepository<Quest, Long> {

}
