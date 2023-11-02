package withoutdatabase;


import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
//http:localhost:8080/product/create
@RequestMapping("/product")
public class ProductController {
	
	 
	 private List<Product> allProduct;
    
	@GetMapping("/create")
     public List<Product> getAllProduct() {
		 allProduct = ProductService.getAllProduct();
    	 return allProduct;
     }
	
	@GetMapping("/getById/{id}")
	public Product getProductById(@PathVariable int id) {
		Product productById = ProductService.getProductById(id);
		return productById;
	}
	
//	@GetMapping("/getById/{id}")
//	public Product getById(@RequestParam int id) {
//		Product productById = ProductService.getById(id);
//		return productById;
//	}
	
	@PostMapping("/insert")
	public Product inserProduct(@RequestBody Product product) {
		
		Product insertProduct = ProductService.insertProduct(product);
		return insertProduct;
	}
	
	@PutMapping("/update/{id}")
	public Product updateProduct(@RequestBody Product product,@PathVariable int id) {
		Product updateProduct = ProductService.updateProduct(product,id);
		return  updateProduct;
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteProduct(@PathVariable int id) {
		ProductService.deleteProductById(id);
		return "data deleted successfully";
	}
	
	
	
	
	
}
