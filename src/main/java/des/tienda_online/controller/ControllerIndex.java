package des.tienda_online.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControllerIndex {

	@GetMapping("/index")
	public String inicio_get(Model model) {
		return "index";
	}
}