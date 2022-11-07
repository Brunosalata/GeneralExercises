package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Employee> emp = new ArrayList<>();
		
		System.out.print("Enter the number of employees: ");
		int n = sc.nextInt();
		
		for(int i = 1; i<=n; i++) {
			System.out.print("\nEmployee #" + i + " data:\nOutsourced (y/n)? ");
			char asw = sc.next().charAt(0); 
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Hours: ");
			int hours = sc.nextInt();
			System.out.print("Value per hour: ");
			Double valuePH = sc.nextDouble();
			if(asw == 'n') {
				Employee employee = new Employee(name, hours, valuePH);
				emp.add(employee);
				//emp.add(new Employee(name, hours, valuePH));				Dessa forma, não precisamos criar a variável employee
			} 
			if (asw == 'y') {
				System.out.print("Vadditional charge: ");
				Double addValue = sc.nextDouble();
				Employee employee = new OutsourcedEmployee(name, hours, valuePH, addValue);
				emp.add(employee);
				//emp.add(new OutsourcedEmployee(name, hours, valuePH, addValue));
			} 
		}
		
		System.out.println("\nPAYMENTS:");
		
		for (int i = 0; i<emp.size(); i++) {
			System.out.println(emp.get(i));
		}
		
		//		for (Employee x : emp) {
		//		System.out.println(emp.getName() + " - $" + String.format("%.2f", emp.payment()));
		//		}
		
		sc.close();

	}

}
