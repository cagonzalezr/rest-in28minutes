package com.in28minues.res.webservices.resfulwebservices.helloworld;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	/**
	 * Si se define la clase con @Controller, sera necesario el uso de 
	 * @ResponseBody para que me regrese el String o el JSON por el Bean,
	 * en el caso del segundo ejemplo GET /hello-world-bean */
	
	@GetMapping("/hello-world")
	//@ResponseMapping(method = RequestMethod.GET, path = "/hello-world")
	//@ResponseBody
	public String helloWorld() {
		return "hello world";	
	}
	
	/*Este regresa un JSON*/
	@GetMapping("/hello-world-bean")
	public HelloWorlBean helloWorldBean() {
		return new HelloWorlBean("hello world");	
	}
	
	@GetMapping("/hello-world-bean/path-variable/{name}")
	public HelloWorlBean helloWorldPathVariable(@PathVariable String name) {
		return new HelloWorlBean( String.format("hello world, %s", name ));	
	}
	

}
