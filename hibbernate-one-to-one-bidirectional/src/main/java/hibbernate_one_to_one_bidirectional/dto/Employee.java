package hibbernate_one_to_one_bidirectional.dto;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name="Employee")
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
	@Id
	@Column(name="empid")
	private int empId;
	@Column(name="empname")
	private String empname;
	@Column(name="empemail")
	private String empEmail;
	public Employee(int empId, String empname, String empEmail) {
		super();
		this.empId = empId;
		this.empname = empname;
		this.empEmail = empEmail;
		
	}
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="LapId")
	private Laptop laptop;
	
	
	
	

}
