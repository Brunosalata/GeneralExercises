package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Employee> list = new ArrayList<>();
		
		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();	
				
		for (int i = 0; i < n; i++) {
			System.out.println();
			System.out.println("Employee #" + (i + 1) + ":");
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			while (hasId(list, id)) {
				System.out.print("Id already taken! Try another one: ");
				id = sc.nextInt();
			}
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			Double salary = sc.nextDouble();
			
			Employee emp = new Employee(id, name, salary);
			
			list.add(emp);
		}
		
		System.out.println();
		System.out.print("Enter the employee id that will have salary increase: ");
		int idSalary = sc.nextInt();		
		
		//	Alternativa 1 para resolução (expressão lambda)
		Employee emp = list.stream().filter(x -> x.getId() == idSalary).findFirst().orElse(null);
		
		if (emp == null) {
			System.out.println("This id does not exist!");
		}
		else {
			System.out.print("Enter the percentage: ");
			double percent = sc.nextDouble();
			emp.increaseSalary(percent);
		}
		
/*		// Alternativa 2 para resolução
 
 		Integer pos = position(list, idSalary);
		if (pos == null) {
			System.out.println("This id does not exist!");
		}
		else {
			System.out.print("Enter the percentage: ");
			double percent = sc.nextDouble();
			list.get(pos).increaseSalary(percent);
		}
*/
		
		System.out.println();
		System.out.println("List of employees: ");
		for (Employee employee : list) {
			System.out.println(employee);
		}
		
		sc.close();
	}

	// Caso seja adotada a Alternativa 2 para resolução, esse método deverá ser criado, para que seja chamado
	// Essa função receberá a lista de funcionários e um id como argumento e vai retornar a posição desse funcionário
	public static Integer position(List<Employee> list, int id) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}
		// Função para validar id disponível (impedindo a inclusão de id já existente)	
	public static boolean hasId(List<Employee> list, int id) {
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null); 
		return emp != null;
	}
		
}
