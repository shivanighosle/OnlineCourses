package com.springrestapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.springrestapi.entity.CoursesEntity;

@Repository
public interface CoursesRepository extends JpaRepository<CoursesEntity, Long>{

	
}
