package cat.itacademy.barcelonactiva.nae.augustin.s04.t01.n02.S04T01N02AugustinNae.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


	@RestController
	public class HelloWorldController {
		public static final String DEFAULT_NAME = "Unknown";

		@GetMapping("/HelloWorld")
		public String saluda(@RequestParam(value = "name", defaultValue = DEFAULT_NAME) String name) {
			return "Hello, " + name + ". You are running a Gradle project.";
		}

		@GetMapping({ "/HelloWorld2", "/HelloWorld2/{name}" })
		public String saluda2(@PathVariable(required = false) String name) {
			if (name == null) {
				name = DEFAULT_NAME;
			}
			return "Hello, " + name + ". You are running a Gradle project.";
		}

	}

