/**
 * 
 */
package com.javaspring.routingpractice.routing;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ccomstock
 *
 */
@RestController
@RequestMapping("/coding")
public class CodingController {

	@GetMapping("")
	public String coding() {
		return "Coding is so much fun!";
	}

	@GetMapping("/python")
	public String python() {
		return "Python/Django was awesome!";
	}

	@GetMapping("/java")
	public String java() {
		return "Java/Spring is better!";
	}
	
}
