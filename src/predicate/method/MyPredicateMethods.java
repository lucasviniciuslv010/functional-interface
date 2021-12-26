package predicate.method;

import entities.Product;

public class MyPredicateMethods {

	public boolean myPredicateMethod(Product product) {
		return product.getPrice() < 1500.0;
	}
	
	public static boolean myStaticPredicateMethod(Product product) {
		return product.getPrice() < 1500.0;
	}
	
}