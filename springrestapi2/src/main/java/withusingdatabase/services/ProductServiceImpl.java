package withusingdatabase.services;

import java.util.List;

import withusingdatabase.entity.Product1;



public interface ProductServiceImpl {
	 
	public List<Product1> getAllProduct();

	public Product1 addProduct(Product1 product);

	public Product1 updateProduct(Product1 product,long id);

	public void deleteProduct(long id);

	public Product1 getProductById(long id);

	public List<Product1> findProductByName(String pname);

	public List<Product1> findAllDesc(Product1 product);
	
	
}
