package com.example.demo.hospital.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.hospital.entity.Appointment;
import com.example.demo.hospital.service.AppointmentService;
@Controller
public class MainController {
	@Autowired
	private AppointmentService service;

	@RequestMapping("/")
	public String viewAppointment(Model model) {
		List<Appointment> listAppointments = service.listAll();
		model.addAttribute("listAppointments", listAppointments);
		return "appointment";

	}

	@RequestMapping("/add")
	public String showNewAppointmentPage(Model model) {
		Appointment appointment = new Appointment();
		model.addAttribute("appointment", appointment);
		return "add";

	}

@RequestMapping(value="/save",method=RequestMethod.POST)
public String saveAppointment(@ModelAttribute("appointment")Appointment appointment) {
	service.save(appointment);
	return "redirect:/";
}

@RequestMapping("/confirm/{id}")
public ModelAndView showAoointmentPage(@PathVariable(name="id")int id )
{
	ModelAndView mav=new ModelAndView("confirm");
	Appointment appointment=service.get(id);
	mav.addObject("appointment",appointment);
	return mav;
}
}
	/*

	@RequestMapping("/confirm/{id}")
	public  String confirmAppointment@PathVariable(name="id")int id) {
		service.conform(id);
		return "redirect:/";
	}
}*/


