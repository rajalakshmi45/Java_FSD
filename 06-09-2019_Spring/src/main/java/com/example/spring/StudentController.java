package com.example.spring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	private StudentDao Dao; 
	@GetMapping("/showForm")
	public String viewPage(Model theModel) 
	{
		Student student = new Student();
		theModel.addAttribute("student", student);
		return "StudentForm";
	}
//	@PostMapping("/processForm")
//	public String processPage(@ModelAttribute("student") Student theStudent,Model theModel)
//	{
//		theModel.addAttribute("tempStudent",theStudent);
//		return "Student-Detail";
//	}
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("student") Student theStudent,Model theModel) {
		
		// log the input data
		theModel.addAttribute("stud",theStudent);
		Dao.createStudent(theStudent);
	    return "student-confirmation";
	}
}
