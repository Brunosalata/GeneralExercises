package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Individual;
import entities.Company;
import entities.Persona;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Persona> list = new ArrayList<Persona>();
		System.out.print("Enter the number of tax payers: ");
		int N = sc.nextInt();
		
		for (int i = 1; i<=N; i++) {
			System.out.println("Tax payer #" + i + " data");
			System.out.print("Individual or company (i / c)? ");
			char e = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Anual Income: ");
			Double income = sc.nextDouble();
			if(e=='i') {
				System.out.print("Health expenditures: ");
				Double HealthPay = sc.nextDouble();
				Persona p = new Individual(name, income, HealthPay);
				list.add(p);
			} else if (e=='c') {
				System.out.print("Number of employees: ");
				int employeeNumber = sc.nextInt();
				Persona p = new Company(name, income, employeeNumber);
				list.add(p);
			}
		}
		
		System.out.println("\nTAXES PAID:");
		Double totalValue = 0.0;
		for (Persona l : list) {
			System.out.println(l.getName() + ": $ " + String.format("%.2f", l.tax()));
			totalValue += l.tax();
		}
		System.out.print("\nTOTAL TAXES: $ " + String.format("%.2f", totalValue));
		
		sc.close();

	}

}
