package nLayeredDemo;

import nLayeredDemo.bussiness.abstracts.ProductService;
import nLayeredDemo.bussiness.concretes.ProductManager;
import nLayeredDemo.core.JLoggerManagerAdapter;
import nLayeredDemo.dataAccess.concretes.AbcProductDao;
import nLayeredDemo.entities.concretes.Product;

public class Main {

	public static void main(String[] args) {
		
		//ToDo : Spring IoC ile çözülecek
		ProductService productService = new ProductManager(new AbcProductDao(), new JLoggerManagerAdapter());
		Product product = new Product(1, 2, "Bardak", 5.5, 5);
		
		productService.add(product);
	}

}
