package nLayeredDemo.bussiness.concretes;

import java.util.List;

import nLayeredDemo.bussiness.abstracts.ProductService;
import nLayeredDemo.core.LoggerService;
import nLayeredDemo.dataAccess.abstracts.ProductDao;
import nLayeredDemo.entities.concretes.Product;

public class ProductManager implements ProductService{

	private ProductDao productDao;
	private LoggerService loggerService;
	
	public ProductManager(ProductDao productDao,LoggerService loggerService) {
		this.productDao = productDao;
		this.loggerService = loggerService;
	}

	@Override
	public void add(Product product) {
		if(product.getCategoryId() == 1) {
			System.out.println("Bu kategoride ürün kabul edilmiyor");
			return;
		}
		
		productDao.add(product);
		loggerService.logToSystem("Ürün eklendi : " + product.getName());
		
		
	}

	@Override
	public void update(Product product) {
		productDao.update(product);
		
	}

	@Override
	public void delete(Product product) {
		productDao.delete(product);
		
	}

	@Override
	public Product get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
