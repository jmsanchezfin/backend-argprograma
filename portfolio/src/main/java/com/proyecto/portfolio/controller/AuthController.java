//Create a Controller class for exposing a GET REST API-

package com.proyecto.portfolio.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

	@RequestMapping({ "/hello" })
	public String firstPage() {
		return "Hello World";
	}

}