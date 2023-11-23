package com.infinite.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Score {

	@Id
	@GeneratedValue
	private Long id;
	private String username;
	private String fullname;
	private String scores;

	public Score() {
		super();
	}

	public Score(Long id, String username, String fullname, String scores) {
		super();
		this.id = id;
		this.username = username;
		this.fullname = fullname;
		this.scores = scores;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getScores() {
		return scores;
	}

	public void setScores(String scores) {
		this.scores = scores;
	}

}
