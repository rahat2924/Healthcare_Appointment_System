package com.rahat.main.modal;

import java.time.LocalDateTime;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Component
@Entity
@Table(name="appointment")
public class Appointment {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDateTime dateTime;
    private Long user_id;
    private Long doc_id;
    
    public Appointment() {
		// TODO Auto-generated constructor stub
	}

	public Appointment(Long id, LocalDateTime dateTime, Long user_id, Long doc_id) {
		super();
		this.id = id;
		this.dateTime = dateTime;
		this.user_id = user_id;
		this.doc_id = doc_id;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDateTime getDateTime() {
		return dateTime;
	}

	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
	}

	public Long getUser_id() {
		return user_id;
	}

	public void setUser_id(Long user_id) {
		this.user_id = user_id;
	}

	public Long getDoc_id() {
		return doc_id;
	}

	public void setDoc_id(Long doc_id) {
		this.doc_id = doc_id;
	}
    
}
