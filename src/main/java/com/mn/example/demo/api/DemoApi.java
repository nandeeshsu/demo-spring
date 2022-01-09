/**
 * 
 */
package com.mn.example.demo.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

/**
 * @author mitanandeesh
 *
 */
@RestController
@Slf4j
@RequestMapping("/api/v1/")
public class DemoApi {

	@GetMapping(path = "hello")
	public String hello() {
		log.info("INFO::Inside the hello method");
		return "Welcome";
	}
}
