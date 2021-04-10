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
@RequestMapping("/dojo")
public class DojoController {
	
	@GetMapping("")
	public String dojo() {
		return "The dojo is awesome!";
	}
	
	@GetMapping("/burbank")
	public String burbank() {
		return "Burbank dojo is located in southern California";
	}
	
	@GetMapping("/san-jose")
	public String sanJose() {
		return "SJ dojo is the headquarters";
	}
	
}
