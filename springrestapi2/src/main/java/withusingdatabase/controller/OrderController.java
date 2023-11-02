package withusingdatabase.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import withusingdatabase.entity.Order;
import withusingdatabase.services.OrderService;

@RestController
@RequestMapping("/order")
public class OrderController {
	@Autowired
	private OrderService orderService;
	
	@GetMapping("/getAll")
	public List<Order> getAllOrders(){
		return orderService.getAllOrder();
	}
	
	@PostMapping("/insert")
	public Order createOrder(@RequestBody Order order){
		return orderService.createOrder(order);
	}

}
