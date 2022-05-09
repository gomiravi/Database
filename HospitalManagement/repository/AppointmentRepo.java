package com.example.demo.hospital.repository;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.hospital.entity.appointment;




public interface AppointmentRepo extends JpaRepository<appointment,Integer> {
	@Modifying 
	@Query(value="select * from appointment a where a.appointment_date =?1 AND a.patientName =?2", nativeQuery=true)
	List<appointment> findByDate(Date date, String patientName);


	
}

