package des.springboot_hibernate.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import des.springboot_hibernate.dao.ProductoDao;
import des.springboot_hibernate.entidades.Producto;

@Controller
public class ControllerProducto {
	
	@Autowired
	private ProductoDao productodao;
	
	@PostMapping(value = "/index")
	public String index_post(Model model, 
							HttpServletRequest request, 
							@RequestParam(value="respuesta",required=false) String respuesta ) {
					
		return "productoCrear";
	}
	
	@PostMapping(value = "/productoCrear")
		public String productoCrear_post(Model model, 
										HttpServletRequest request, 
										@RequestParam(value="titulo",required=false) String titulo,
										@RequestParam(value="descripcion",required=false) String descripcion,
										@RequestParam(value="precio",required=false) Double precio,
										@RequestParam(value="descuento",required=false) Double descuento
										) {
		Producto producto = new Producto(titulo,descripcion,precio,descuento);
		productodao.save(producto);
		
		return "index";
	}
	/*
	 * TODO
	@GetMapping(value="/{id}Producto")
	public @ResponseBody ResponseEntity<String> 
	getById(@PathVariable String id) {
		
	
		return "productoCrear";
}*/

	
}
