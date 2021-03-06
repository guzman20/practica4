package des.tienda_online.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import des.tienda_online.entidades.Producto;
import des.tienda_online.servicios.ProductoServicio;

@Controller
public class ControllerIndex {
	
	@Autowired
	private ProductoServicio productoServicio;

	@GetMapping({"/","/index"})
	public String inicio_get(Model model) {
		List<Producto> lista =productoServicio.listarProductos(8);
		model.addAttribute("lista",lista);
		return "index";
	}
}