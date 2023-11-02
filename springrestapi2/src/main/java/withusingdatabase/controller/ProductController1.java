package withusingdatabase.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import withoutdatabase.Product;
import withoutdatabase.ProductService;
import withusingdatabase.entity.Product1;
import withusingdatabase.repository.ProductRepository;
import withusingdatabase.services.ProductService1;
import withusingdatabase.services.ProductServiceImpl;
import withusingdatabase.services.ProductServiceImpl;

@RestController
@RequestMapping("/product")
public class ProductController1 {
	
	@Autowired
	private ProductServiceImpl productService;
	
	@GetMapping("/get")
	public List<Product1> getAllProduct(){
		return productService.getAllProduct();
			
	}
	
	@PostMapping("/add")
	public Product1 addProducts(@RequestBody Product1 product){
		return productService.addProduct(product);
		
	}
	
	@PutMapping("/update/{id}")
	public Product1 updateProduct(@RequestBody Product1 product,@PathVariable long id) {
		return productService.updateProduct(product,id);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteProduct(@PathVariable int id) {
		productService.deleteProduct(id);
		return "Data Deleted Successfully!";
	}
	
	@GetMapping("/get/{id}")
	public Product1 getProductById(@PathVariable long id ) {
		return productService.getProductById(id);
	}
	
	@GetMapping("/find/{pname}")
	public List<Product1> findProductByName(@PathVariable String pname) {
		return productService.findProductByName(pname);
	}
	
	@GetMapping("/asc")
	public List<Product1> findAllDesc(@RequestBody Product1 product) {
		return productService.findAllDesc(product);
	}
	
	

}
