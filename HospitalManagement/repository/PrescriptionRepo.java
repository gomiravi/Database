package com.example.demo.hospital.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.hospital.entity.Prescription;

public interface PrescriptionRepo extends JpaRepository<Prescription,String> {

	List<Prescription> findByPatientName(String patientName); 

}
