package upeu.edu.pe.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import upeu.edu.pe.Entity.Suppliers;
import upeu.edu.pe.Service.SuppliersService;

@RestController
@RequestMapping("api/sup")
public class SuppliersController {
	
	@Autowired
	private SuppliersService suppliersService;
	
	@GetMapping("/all")
	public List<Suppliers> readAll(){
		return suppliersService.reAll();
	}
	
}
