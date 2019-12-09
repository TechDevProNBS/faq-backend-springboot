package com.nationwide.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.nationwide.Entity.QuestionEntity;
import java.util.List;

@Repository
public interface QuestionRepo extends JpaRepository<QuestionEntity, Integer>{
	
	public List<QuestionEntity> findAll();
	
	public Optional<QuestionEntity> findById(int q_id);
	
	@Query(value = "SELECT SUM(q.rating) FROM QuestionEntity q")
	int totalQRatings();
}