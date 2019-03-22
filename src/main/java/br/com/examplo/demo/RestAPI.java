package br.com.examplo.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestAPI {
	@GetMapping(value = "/")
	public String getMethodName() {
		return "Hello World!";
	}

}
