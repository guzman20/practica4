package des.springboot_hibernate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


import des.springboot_hibernate.dao.ProductoDao;
import des.springboot_hibernate.entidades.Producto;

@Controller
public class ControllerProducto {
	
	@Autowired
	private ProductoDao productodao;
	
	@PostMapping(value = "/index")
	public String index_post(Model model,  
							@RequestParam(value="respuesta",required=false) String respuesta ) {
					
		return "productoCrear";
	}
	
	@PostMapping(value = "/productoCrear")
		public String productoCrear_post(Model model,
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
