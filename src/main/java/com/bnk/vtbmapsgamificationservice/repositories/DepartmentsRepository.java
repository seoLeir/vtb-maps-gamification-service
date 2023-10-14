package com.bnk.vtbmapsgamificationservice.repositories;

import com.bnk.vtbmapsgamificationservice.entities.Department;
import com.bnk.vtbmapsgamificationservice.entities.Quest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



public interface DepartmentsRepository extends JpaRepository<Department, Long>  {

}
