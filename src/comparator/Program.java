package comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;

import comparator.method.MyComparatorMethods;
import comparator.object.MyComparatorClass;
import entities.Product;


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
		products.sort(new MyComparatorClass());
		
		
		
		//###########################################################
		
		
		
		/* ANONYMOUS CLASS OBJECT */
		Comparator<Product> comparator = new Comparator<>() {
			
			@Override
			public int compare(Product p1, Product p2) {
				return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
			}
			
		};
		
		products.sort(comparator);
		
		
		
		//###########################################################
		
		
		
		/* LAMBDA EXPRESSION OBJECT WITH THE KEYS */
		Comparator<Product> comparator2 = (p1, p2) -> {
			return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
		};
		
		products.sort(comparator2);
		
		
		
		//###########################################################
		
		
		
		/* LAMBDA EXPRESSION OBJECT WITHOUT THE KEYS */
		Comparator<Product> comparator3 = (p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
	
		products.sort(comparator3);
		
		
		
		//###########################################################
		
		
		
		//******
		/* LAMBDA EXPRESSION IN THE ARGUMENT */
		products.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));
		//******
		
		
		
		//###########################################################
		
		
		
		/* INSTANCE METHOD REFERENCE */
		products.sort(Product::myComparatorMethod);
		
		
		
		//###########################################################
		
		
		
		/* STATIC METHOD REFERENCE */
		products.sort(Product::myStaticComparatorMethod);
		
		
		
		//###########################################################
		
		
		
		/* INSTANCE METHOD REFERENCE - SEPARATE CLASS OBJECT */
		products.sort(new MyComparatorMethods()::myComparatorMethod);
		
		
		
		//###########################################################
		
		
		
		/* STATIC METHOD REFERENCE - SEPARATE CLASS OBJECT */
		products.sort(MyComparatorMethods::myStaticComparatorMethod);
		
		
	}
	
}