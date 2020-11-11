package des.hibernate.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import des.hibernate.dao.ProductoDao;

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
										@RequestParam(value="respuesta",required=false) String respuesta ) {
		
		return "producto";
	}

}
