package withusingdatabase.services;

import java.util.List;

import withusingdatabase.entity.Order;

public interface OrderService {

	Order createOrder(Order order);

	List<Order> getAllOrder();

}
