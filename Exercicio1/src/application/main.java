package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Funcionarios;

public class main {

	private static final Funcionarios Funcionarios = null;

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N;
		List<Funcionarios> list = new ArrayList<>();
				
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
			
			Funcionarios emp = new Funcionarios(id, name, salary);
			
			list.add(emp);
		}
		
		System.out.println();
		System.out.print("Enter the employee id that will have salary increase: ");
		int employeeId = sc.nextInt();
		
		Funcionarios emp = list.stream().filter(x->x.getId() == employeeId).findFirst().orElse(null);
		
		
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
		for (Funcionarios x : list) {
			System.out.println(x);
		}
		    
		sc.close();
		
	}
	
	
	public static Integer position(List<Funcionarios> list, int id) {
		for (int i = 0; i<list.size(); i++) {
			if(list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}
	
	public static boolean hasId(List<Funcionarios> list, int id) {
		Funcionarios empId = list.stream().filter(x->x.getId() == id).findFirst().orElse(null);
		return empId != null;
	}
	
}
