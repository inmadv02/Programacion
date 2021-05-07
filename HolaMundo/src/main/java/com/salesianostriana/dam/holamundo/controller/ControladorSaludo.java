
package com.salesianostriana.dam.holamundo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControladorSaludo {
	
	@GetMapping("/saludo3")
	
	//De forma antigua sería @RequestMapping (value="/saludo3", method=RequestMethod.GET)
	
	public String saludoController3 (Model model){
		
		model.addAttribute("saludo", "Hola Mundo!!!");
		model.addAttribute("mensaje","Me llena de orgullo y satisfacción...");
		model.addAttribute("url", "https://triana.salesianos.edu");
		return "PlantillaSaludo3";

	}


}
