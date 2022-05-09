package com.example.demo.hospital.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.hospital.entity.Appointment;
import com.example.demo.hospital.repository.AppointmentRepository;

@Transactional
@Service
public class AppointmentService {
		
		@Autowired
		private AppointmentRepository repo;
		public List<Appointment>listAll(){
			return repo.findAll();
		}
		public void save(Appointment appointment) {
			repo.save(appointment);
		}
		public Appointment get(int id) {
			return repo.findById(id).get();
			
		}
		//public void confirm(int id) {
			//repo.confirmById(id);
			
		//}
		/*private AppointmentRepo bookAppointment;
		
		
		
		public List<Appointment> listAll(){
			return bookAppointment.findAll();
		}
		
		public void save(Appointment appointment) {
			bookAppointment.save(appointment);
		}
		
		
		public void delete(Integer id) {
			bookAppointment.deleteById(id);
		}
		
		
		
		
		public Optional<Appointment> get(Integer id) {
			return bookAppointment.findById(id);
			
		}
		*/
		
		
		/*public List<Appointment> findByDate( Date date,String PatientName){
			return bookAppointment.findByDate(date,PatientName);
		}

		*/		
}
