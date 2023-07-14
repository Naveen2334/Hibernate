package hibbernate_one_to_one_bidirectional.Controller;

import java.util.List;

import hibbernate_one_to_one_bidirectional.Service.EmployeeService;
import hibbernate_one_to_one_bidirectional.dto.Employee;

public class DisplayAllEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeService employeeService = new EmployeeService();
	List<Employee> employee =	employeeService.displayAll();
	for (Employee employee2 : employee) {
		System.out.println("Employee Id"+employee2.getEmpId());
		System.out.println("Laptop Id= "+employee2.getLaptop().getLaptopId());
	
	}
	
	}

}
