package upeu.edu.pe.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import upeu.edu.pe.Entity.Order;
import upeu.edu.pe.Service.OrderService;

@RestController
@RequestMapping("api/order")
public class OrderController {
	
	@Autowired
	private OrderService orderService;
	
	@GetMapping("/all")
	public List<Order> readAll(){
		return orderService.reAll();
	}
}
