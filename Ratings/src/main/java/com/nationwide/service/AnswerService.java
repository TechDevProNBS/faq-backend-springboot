package com.nationwide.service;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.nationwide.Entity.AnswerEntity;
import com.nationwide.repository.AnswerRepo;

@Service
public class AnswerService {
	@Autowired AnswerRepo aRepo;
	
	public Optional<AnswerEntity> findAnswerRating(Integer a_id){
		return aRepo.findById(a_id);
		
	}

	public void editAnswerRating(AnswerEntity ref) {
		aRepo.save(ref);
	}
}
