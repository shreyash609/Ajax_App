package in.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FrontController {

	@GetMapping("/form")
	public String getMsg() {
		return "index";
	}
	
//	
//	@PostMapping("/submit")
//	public String get(@RequestParam String name, Model model) {
//		
//		model.addAttribute("key",name);
//		return "index";
//	}
	
	@PostMapping("/submit")
	@ResponseBody
	public String get(@RequestParam String name) {
	    // Process the submitted name (you can add any logic here)
	    return "Hello, " + name + "!"; // Return the response
	}

}
