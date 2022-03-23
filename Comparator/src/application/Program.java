package application;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("TV", 900.00));
		list.add(new Product("Notebook", 1200.00));
		list.add(new Product("Tablet", 450.00));
		
		Comparator<Product> comp = (p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
		
		//Expressão Lambda //Função Anonima
		//Comparator<Product> comp = (p1, p2) -> {
		//	return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
		//};
				
		//new Comparator<Product>() {

		//@Override
		//public int compare(Product p1, Product p2) {
		//	return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
		//	}
		//};
		
		list.sort(comp);
		
		// Expressão Lambda diretamente no argumento
		//list.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));
		
		for (Product p : list) {
			System.out.println(p);
		}
	}

}
