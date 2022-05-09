package com.example.demo.hospital.entity;

import java.text.DateFormat;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Appointment {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private Integer appointment_id;

	private String patientName;
	private long mobile_No;
	private DateFormat date;
	private String confirmed;
	public Integer getAppointment_id() {
		return appointment_id;
	}

	public void setAppointment_id(Integer appointment_id) {
		this.appointment_id = appointment_id;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public long getMobile_No() {
		return mobile_No;
	}

	public void setMobile_No(long mobile_No) {
		this.mobile_No = mobile_No;
	}

	public DateFormat getDate() {
		return date;
	}

	public void setDate(DateFormat date) {
		this.date = date;
	}

	public String getConfirmed() {
		return confirmed;
	}

	public void setConfirmed(String confirmed) {
		this.confirmed = confirmed;
	}

	public Appointment(Integer appointment_id, String patientName, long mobile_No, DateFormat date, String confirmed) {
		super();
		this.appointment_id = appointment_id;
		this.patientName = patientName;
		this.mobile_No = mobile_No;
		this.date = date;
		this.confirmed = confirmed;
	}

	

	public Appointment() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Appointment [appointment_id=" + appointment_id + ", patientName=" + patientName + ", mobile_No="
				+ mobile_No + ", date=" + date + ", confirmed=" + confirmed + "]";
	}


	
}
