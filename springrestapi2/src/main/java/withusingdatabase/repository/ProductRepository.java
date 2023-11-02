package withusingdatabase.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import withusingdatabase.entity.Product1;

public interface ProductRepository extends JpaRepository<Product1, Long>{
   @Query("select p From Product1 p where pname=:pname")
   List<Product1> findByName(String pname);
   
   @Query("select p from Product1 p order by pname asc")
   List<Product1> findAll(Product1 product);
}
