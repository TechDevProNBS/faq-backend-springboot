package com.nationwide.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.nationwide.Entity.AnswerEntity;

@Repository
public interface AnswerRepo extends JpaRepository<AnswerEntity, Integer> {
	public Optional<AnswerEntity> findById(int a_id);
}