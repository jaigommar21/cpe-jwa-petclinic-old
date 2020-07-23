
package com.tecsup.jwa.petclinic.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PetController {

	@GetMapping("welcome")
	String welcome() {
		return "Welcome to Tecsup";
	}
}
