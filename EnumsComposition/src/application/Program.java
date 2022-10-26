package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.OrderStatus;
import entities.Product;

public class Program {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter client data:\nName:");
		String cName = sc.nextLine();
		System.out.print("Email: ");
		String cEmail = sc.nextLine();
		System.out.print("Birth Date (DD/MM/YYYY): ");
		Date cBirthDate = sdf.parse(sc.nextLine());
		Client client = new Client(cName, cEmail, cBirthDate);
		
		System.out.print("\nEnter order data:\nStatus: ");
		OrderStatus oStatus = OrderStatus.valueOf(sc.nextLine());
		
		Order order = new Order(new Date(), oStatus, client);
		
		System.out.print("\nHow many items to this order? ");
		int n = sc.nextInt();
		for(int i = 1; i<=n; i++) {
			System.out.println("\nEnter #" + i + " item data:");
			System.out.print("Product name: ");
			sc.nextLine();
			String pName = sc.nextLine();
			System.out.print("Product price: ");
			double pPrice = sc.nextDouble();
			Product p = new Product(pName, pPrice);
			System.out.print("Quantity: ");
			int pQuantity = sc.nextInt();
			OrderItem orderItem = new OrderItem(pQuantity, pPrice, p);
			
			order.addItem(orderItem);
		}
		
		System.out.println("\nORDER SUMMARY:");
		System.out.println(order);
		
		
		sc.close();
	}

}
