package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		List<Product> list = new ArrayList<>();
		
		System.out.print("Enter the number of products: ");
		int N = sc.nextInt();
		
		for (int i = 1; i<= N; i++) {
			System.out.print("Product #" + i + " data:\nCommon, used or imported (c/u/i)? ");
			char type = sc.next().charAt(0);
			System.out.print("Product name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Product price: ");
			Double price = sc.nextDouble();
			if (type == 'i') {
				System.out.print("Customs fee: ");
				Double cFee = sc.nextDouble();
				list.add(new ImportedProduct(name, price, cFee));
				//Product p = new ImportedProduct(name, price, cFee);
				//list.add(p);
			} else if (type == 'u') {
				System.out.print("Manufacture date: ");
				Date date = sdf.parse(sc.next());
				list.add(new UsedProduct(name, price, date));
				//Product p = new UsedProduct(name, price, date);
				//list.add(p);
			} else if (type == 'c') {
				list.add(new Product (name, price));
				//Product p = new Product (name, price);
				//list.add(p);
			}
		}
			
		System.out.println("\nPRICE TAGS:");
		for(Product x : list) {
			System.out.println(x.priceTag());
		}
		
		sc.close();
	}

}
