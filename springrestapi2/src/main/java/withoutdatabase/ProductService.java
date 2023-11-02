package withoutdatabase;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class ProductService {
	
	private static Map<Integer,Product> ps = new HashMap();
	private static int index=4;
    static {
		Product p1 = new Product(1, "Facewash", 1000);
		Product p2 = new Product(2, "Oil", 2000);
		Product p3 = new Product(3, "Soap", 3000);
		ps.put(1, p1);
		ps.put(2, p2);
		ps.put(3, p3);
	}
	public static List<Product> getAllProduct() {
		
		return new ArrayList<Product>(ps.values());
	}
	
	

	public static Product getProductById(int id) {
		return ps.get(id);
		
	}
//	public static Product getById(int id) {
//		return ps.get(id);
//		
//	}
	
	public static Product insertProduct(Product product) {
		index=index+1;
		product.setId(index);
		ps.put(index, product);
		return product;
		
	}

	public static Product updateProduct(Product product,int id) {
		product.setPname(product.getPname());
		product.setPrice(product.getPrice());
		ps.put(id, product);
		return product;
	}



	public static Product deleteProductById(int id) {
		Product remove = ps.remove(id);
		return remove;
	}



	
	
	

}
