package io.github.rogerion.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/api/v1/books")
public class BookController {

	@ApiOperation(value="Return an example Hello World")
	@ApiResponses(value= {
			@ApiResponse(code=200, message= "Sucess method return")
	})
	@GetMapping
	public String hello() {
		return "Hello from bookstore manager";
	}
	
}
