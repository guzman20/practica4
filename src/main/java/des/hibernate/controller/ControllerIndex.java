package des.hibernate.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControllerIndex {

	@GetMapping("/index")
	public String inicio_get(Model model, HttpSession session) {
		return "index";
	}
}
