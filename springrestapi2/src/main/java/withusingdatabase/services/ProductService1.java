package withusingdatabase.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import withusingdatabase.entity.Product1;
import withusingdatabase.repository.ProductRepository;

@Service
public class ProductService1 implements ProductServiceImpl{
	
	@Autowired
	private ProductRepository productRepository;

	@Override
	public List<Product1> getAllProduct() {
		return productRepository.findAll();
		
	}

	@Override
	public Product1 addProduct(Product1 product) {
		Product1 product1=new Product1();
		product1.setpName(product.getpName());
		product1.setPrice(product.getPrice());
		Product1 save = productRepository.save(product);
		return save;
	}

	@Override
	public Product1 updateProduct(Product1 product,long id) {
		Product1 productUpdate=new Product1();
		productUpdate.setpName(product.getpName());
		productUpdate.setPrice(product.getPrice());
		productUpdate.setPid(id);
		return productRepository.save(productUpdate);
	}

	@Override
	public void deleteProduct(long id) {
		Optional<Product1> findById = productRepository.findById(id);
		productRepository.delete(findById.get());
		
	}
	
	@Override
	public Product1 getProductById(long id) {
		return productRepository.findById(id).get();
	}

	@Override
	public List<Product1> findProductByName(String pname) {
		List<Product1> name = productRepository.findByName(pname);
		return name;
	}

	@Override
	public List<Product1> findAllDesc(Product1 product) {
		List<Product1> findAll = productRepository.findAll(product);
		return findAll;
	}

	

	
	
	

}
