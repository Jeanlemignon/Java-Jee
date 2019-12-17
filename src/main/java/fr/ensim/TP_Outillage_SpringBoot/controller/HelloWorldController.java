package fr.ensim.TP_Outillage_SpringBoot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {

	@GetMapping(value="/greeting")
	public String greeting(@RequestParam(name="nameGET", required=false,  defaultValue="World") String nameGET, Model model) {
		model.addAttribute("nomTemplate",nameGET);
		return "greeting";
	}
}
