package com.rahat.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rahat.main.modal.Doctor;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {

}
