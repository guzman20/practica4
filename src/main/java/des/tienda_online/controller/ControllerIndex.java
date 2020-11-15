package des.tienda_online.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ControllerIndex {

	@GetMapping("/index")
	public String inicio_get(Model model) {
		return "index";
	}
	@PostMapping("/index")
	public String inicio_post(Model model) {
		return "Producto/Crear";
	}
}