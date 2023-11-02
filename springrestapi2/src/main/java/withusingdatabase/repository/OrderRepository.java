package withusingdatabase.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import withusingdatabase.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Integer>{
	

}
