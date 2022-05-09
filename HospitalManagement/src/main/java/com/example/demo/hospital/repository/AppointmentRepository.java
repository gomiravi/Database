package com.example.demo.hospital.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.hospital.entity.Appointment;

public interface AppointmentRepository extends JpaRepository<Appointment,Integer> {

	void confirmById(int id);

	
}

