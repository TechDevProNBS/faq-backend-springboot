package com.nationwide.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.nationwide.Entity.QuestionEntity;

@Repository
public interface QuestionRepo extends JpaRepository<QuestionEntity, Integer>{
	public Optional<QuestionEntity> findById(int q_id);
}