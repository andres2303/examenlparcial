package upeu.edu.pe.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import upeu.edu.pe.Entity.Productos;
import upeu.edu.pe.Service.ProductosService;

@RestController
@RequestMapping("api/prod")
public class ProductosController {

	@Autowired
	private ProductosService productosService;
	
	@GetMapping("/all")
	public List<Productos> readAll(){
		return productosService.reAll();
	}

}
