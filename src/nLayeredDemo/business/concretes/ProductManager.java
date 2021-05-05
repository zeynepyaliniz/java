package nLayeredDemo.business.concretes;

import java.util.List;
import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.core.JLoggerManagerAdapter;
import nLayeredDemo.dataAccess.abstracts.ProductDao;
import nLayeredDemo.entities.concretes.Product;
import nLayeredDemo.jLogger.JLoggerManager;

public class ProductManager implements ProductService {
	
	private ProductDao productDao;	 
	private JLoggerManagerAdapter jLoggerManagerAdapter;
	public ProductManager(ProductDao productDao,JLoggerManagerAdapter jLoggerManagerAdapter) {
		super();
		this.productDao = productDao;	
		this.jLoggerManagerAdapter = jLoggerManagerAdapter;
	}
	

	@Override
	public void add(Product product) {
		if(product.getCategoryId() == 1) {
			System.out.println("Cannot add product with this category.");
			return;
		}
		this.productDao.add(product);
		this.jLoggerManagerAdapter.logExternal(product.getName() + " loglandi");
		
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
