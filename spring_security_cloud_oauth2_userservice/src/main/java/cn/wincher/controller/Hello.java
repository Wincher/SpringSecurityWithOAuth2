package cn.wincher.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wincher
 * <p> cn.wincher.controller <p>
 */
@RestController
public class Hello {
	@GetMapping("/hello")
	public String hello() {
		return "Hello";
	}
}
