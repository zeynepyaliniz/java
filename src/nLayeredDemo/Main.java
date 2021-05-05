package nLayeredDemo;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.business.concretes.ProductManager;
import nLayeredDemo.core.JLoggerManagerAdapter;
import nLayeredDemo.dataAccess.concretes.HibernateProductDao;
import nLayeredDemo.entities.concretes.Product;

public class Main {

	public static void main(String[] args) {
		System.out.println("Welcome to Test Environment");
		// TODO Spring IOC will implement.
		ProductService productService = new ProductManager(new HibernateProductDao(), new JLoggerManagerAdapter()); 
		// bad code... real project should not new anything except entities...
		Product product = new Product(1,2,"Elma",12,50);
		productService.add(product);
	}

}
