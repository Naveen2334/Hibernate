package hibbernate_one_to_one_bidirectional.Service;

import hibbernate_one_to_one_bidirectional.dao.EmployeeDao;
import hibbernate_one_to_one_bidirectional.dto.Employee;

public class EmployeeService {
	EmployeeDao employeeDao = new EmployeeDao();
	public  void saveEmployee(Employee employee)
	{
		employeeDao.saveEmployee(employee);
	}
	public java.util.List<Employee> displayAll(){
		return employeeDao.displayAll();
	}

}
