package spring_boot.sb_project1.inside;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class MyFirstapi {
	
			@GetMapping(value="/api1")
			public String greet1() {
				return "greet1 says helloooo";
			}
			
			@GetMapping(value="/api2")
			public String greet2() {
				return "greet2 says goodbye";
			}

}
