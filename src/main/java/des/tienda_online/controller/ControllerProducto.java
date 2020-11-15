package des.tienda_online.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import des.tienda_online.entidades.Producto;
import des.tienda_online.servicios.ProductoServicio;

@Controller
@RequestMapping(value = "/Producto")
public class ControllerProducto {
	
	@Autowired
	private ProductoServicio productoServicio;
	
	@GetMapping("/Crear")
	public String index_post(Model model) {
					
		return "Producto/Crear";
	}
	
	@PostMapping("/Crear")
		public String productoCrear_post(Model model,
										@RequestParam(value="titulo",required=false) String titulo,
										@RequestParam(value="descripcion",required=false) String descripcion,
										@RequestParam(value="precio",required=false) Double precio,
										@RequestParam(value="descuento",required=false) Double descuento
										) {
		Producto producto = new Producto(titulo,descripcion,precio,descuento);
		productoServicio.crearProducto(producto);
		
		return "redirect:/index";
	}
	
	
	@RequestMapping(method = RequestMethod.GET, value = "/{id}")
	public ModelAndView perfilProducto(@PathVariable("id") long idProducto) {

		ModelAndView mav = new ModelAndView();

		Producto producto = productoServicio.obtenerProducto(idProducto);

		mav.addObject("producto", producto);
		mav.setViewName("Producto/perfil");
		return mav;
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "borrar/{id}")
	public String productoBorrar_post(Model model,
			@PathVariable("id") long idProducto
			) {
			productoServicio.eliminarProducto(idProducto);

			return "redirect:/index";
}
}
