package withusingdatabase.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import withusingdatabase.entity.Order;
import withusingdatabase.entity.Product1;
import withusingdatabase.repository.OrderRepository;

@Service
public class OrderServiceImpl implements OrderService{
	
	@Autowired
	private OrderRepository orderRepository;

	@Override
	public Order createOrder(Order order) {
		Order order1=new Order();
		order1.setOrderStatus(order.getOrderStatus());
		Product1 product =new Product1();
		order1.setProduct(product);
		return orderRepository.save(order);
	}

	@Override
	public List<Order> getAllOrder() {
		return orderRepository.findAll();
	}

}
