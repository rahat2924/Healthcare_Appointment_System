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

import com.rahat.main.modal.Doctor;
import com.rahat.main.repository.DoctorRepository;

@RestController
@RequestMapping("/api/doctor")
public class DoctorController {

	@Autowired 
	private DoctorRepository doctorRepo;
	
	@PostMapping("/add")
	public Doctor addDoctor(@RequestBody Doctor doctor) {
		return doctorRepo.save(doctor);
	}
	
	@GetMapping("/all")
	public List<Doctor> getAllDoctor() {
		return doctorRepo.findAll();
	}
	
	@PatchMapping("/update")
	public Doctor updateDoctor(@RequestBody Doctor doctor) {
		return doctorRepo.save(doctor);
	}
	
	@DeleteMapping("/delete/{did}")
	public String deleteDoctor(@PathVariable("did") Long id) {
		try {
			doctorRepo.deleteById(id);
		} catch (Exception e) {
			return "Failed to delete";
		}
		
		return "Successfully delete";
	}
}
