package com.rahat.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rahat.main.modal.Appointment;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {

}
