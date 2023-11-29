package com.rahat.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rahat.main.modal.Appointment;
import com.rahat.main.repository.AppointmentRepository;

@RestController
@RequestMapping("/api/appointment")
public class AppointmentController {
	@Autowired
	private AppointmentRepository appointmentRepo;
	
	@PostMapping("/add")
	public Appointment addAppointment(@RequestBody Appointment appointment) {
		return appointmentRepo.save(appointment);
	}
	
	@GetMapping("/all")
	public List<Appointment> getAllAppointment() {
		return appointmentRepo.findAll();
	}
	
	@PatchMapping("/update")
	public Appointment updateAppointment(@RequestBody Appointment appointment) {
		return appointmentRepo.save(appointment);
	}
	
	@DeleteMapping("/delete/{aid}")
	public String deleteAppointment(@PathVariable("aid") Long id) {
		try {
			appointmentRepo.deleteById(id);
		} catch (Exception e) {
			return "Failed to delete";
		}
		
		return "Successfully delete";
	}
}
