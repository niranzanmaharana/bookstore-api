/**
 * 
 */
package org.niranzan.bookstore.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Dell
 *
 */

@RestController
public class HomeController {
	
	@GetMapping
	public String welcome() {
		return "Welcome to Bookstore Backend API";
	}
}
