package hibbernate_one_to_one_bidirectional.Controller;

import java.util.Scanner;

import hibbernate_one_to_one_bidirectional.Service.EmployeeService;
import hibbernate_one_to_one_bidirectional.dto.Employee;
import hibbernate_one_to_one_bidirectional.dto.Laptop;

public class EmployeeController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Employee employee = new Employee();
		Laptop laptop = new Laptop();
		while(true) {
			System.out.println("Enter the EmpId");
			int id = sc.nextInt();
			employee.setEmpId(id);
			System.out.println("Enter the Empname");
			String name = sc.next();
			employee.setEmpname(name);
			System.out.println("Enter the emp email");
			String email = sc.next();
			employee.setEmpEmail(email);
			employee.setLaptop(laptop);
			EmployeeService employeeService = new EmployeeService();
			employeeService.saveEmployee(employee);
		}
	}

}
