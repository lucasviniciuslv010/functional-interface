package predicate.object;

import java.util.function.Predicate;

import entities.Product;

public class MyPredicateClass implements Predicate<Product> {

	@Override
	public boolean test(Product product) {
		return product.getPrice() < 1500.0;	
	}

}