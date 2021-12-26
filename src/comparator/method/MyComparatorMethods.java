package comparator.method;

import entities.Product;

public class MyComparatorMethods {

	public int myComparatorMethod(Product p1, Product p2) {
		return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
	}
	
	public static int myStaticComparatorMethod(Product p1, Product p2) {
		return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
	}
	
}