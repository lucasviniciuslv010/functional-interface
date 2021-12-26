package predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Predicate;

import entities.Product;
import predicate.method.MyPredicateMethods;
import predicate.object.MyPredicateClass;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		List<Product> products = new ArrayList<>();
		products.add(new Product(1L, "TV", 2100.99, 3));
		products.add(new Product(2L, "Notebook Acer", 3700.90, 7));
		products.add(new Product(3L, "Samsung S10", 1900.99, 4));
		products.add(new Product(4L, "Iphone 12", 12000.00, 3));
		products.add(new Product(5L, "Microwave", 900.99, 5));
		products.add(new Product(6L, "Alarm Clock", 55.90, 8));
		
		
		
		/* SEPARATE CLASS OBJECT */
		products.removeIf(new MyPredicateClass());
		
		
		
		//###########################################################
		
		
		
		/* ANONYMOUS CLASS OBJECT */
		Predicate<Product> predicate = new Predicate<>() {

			@Override
			public boolean test(Product product) {
				return product.getPrice() < 1500.0;
			}
			
		};
		
		products.removeIf(predicate);
		
		
		
		//###########################################################
		
		
		
		/* LAMBDA EXPRESSION OBJECT WITH THE KEYS */
		Predicate<Product> predicate2 = product -> {
			return product.getPrice() < 1500.0;
		};
		
		products.removeIf(predicate2);
		
		
		
		//###########################################################
		
		
		
		/* LAMBDA EXPRESSION OBJECT WITHOUT THE KEYS */
		Predicate<Product> predicate3 = product -> product.getPrice() < 1500;
		
		products.removeIf(predicate3);
		
		
		
		//###########################################################
		
		
		
		//******
		/* LAMBDA EXPRESSION IN THE ARGUMENT */
		products.removeIf(product -> product.getPrice() < 1500);
		//******
		
		
		
		//###########################################################
		
		
		
		/* INSTANCE METHOD REFERENCE */
		products.removeIf(Product::myPredicateMethod);
		
		
		
		//###########################################################
		
		
		
		/* STATIC METHOD REFERENCE */
		products.removeIf(Product::myStaticPredicateMethod);
		
		
		//###########################################################
		
		
		
		/* INSTANCE METHOD REFERENCE - SEPARATE CLASS OBJECT */
		products.removeIf(new MyPredicateMethods()::myPredicateMethod);
		
		
	
		//###########################################################
		
		
		
		/* STATIC METHOD REFERENCE - SEPARATE CLASS OBJECT */
		products.removeIf(MyPredicateMethods::myStaticPredicateMethod);
		
	}
	
}