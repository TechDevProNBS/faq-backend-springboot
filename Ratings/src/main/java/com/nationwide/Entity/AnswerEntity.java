package com.nationwide.Entity;

import java.sql.Timestamp;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "answerrating")
public class AnswerEntity {
	@Id
	private Integer a_id;
	
	private int u_id;
	
	private int rating;
	
	private Timestamp postdate_AR;

	public Integer getA_id() {
		return a_id;
	}

	public void setA_id(Integer a_id) {
		this.a_id = a_id;
	}

	public int getU_id() {
		return u_id;
	}

	public void setU_id(int u_id) {
		this.u_id = u_id;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public Timestamp getPostdate_AR() {
		return postdate_AR;
	}

	public void setPostdate_AR(Timestamp postdate_AR) {
		this.postdate_AR = postdate_AR;
	}
	
}
