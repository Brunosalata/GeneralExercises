package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employees;

public class main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N;
		List<Employees> list = new ArrayList<>();
				
		System.out.print("How many employees will be registered? ");
		N = sc.nextInt();
		
		for (int i = 0; i<N; i++) {
			System.out.println("Employee #" + (i+1) + ":");
			System.out.print("Id: ");
			int id = sc.nextInt();
				while(hasId(list, id) == true) {
					System.out.println("O id já existe! Tente com outro valor.");
					id = sc.nextInt();
				}
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			Employees emp = new Employees(id, name, salary);
			list.add(emp);
		}
		
		System.out.println();
		System.out.print("Enter the employee id that will have salary increase: ");
		int employeeId = sc.nextInt();
		
		Employees emp = list.stream().filter(x->x.getId() == employeeId).findFirst().orElse(null);
		//Integer emp = position(list, employeeId);
		
		if(emp == null) {
			System.out.println("This id does not exist!");
		} else {
			System.out.println("Enter the percentage: ");
			double percent = sc.nextDouble();
			emp.increaseSalary(percent);
		}
		System.out.println();
		System.out.println("List of employees: ");
		for (Employees x : list) {
			System.out.println(x);
		}
		sc.close();	
	}
	
	public static Integer position(List<Employees> list, int id) {
		for (int i = 0; i<list.size(); i++) {
			if(list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}
	
	public static boolean hasId(List<Employees> list, int id) {
		Employees empId = list.stream().filter(x->x.getId() == id).findFirst().orElse(null);
		return empId != null;
	}
	
}
