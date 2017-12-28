package main.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee_details", schema="dbhybrid_transcription")
public class Employee {

	@Id
	@Column(name="id")
	private int empId;
	
	@Column(name="\"emp_name\"")
	private String empName;
	
	@Column(name="\"emp_desig\"")
	private String empDesig;
	
	@Column(name="\"emp-sal\"")
	private double empSal;
	
	public Employee(){}
	
	public Employee(int empId, String empName, String empDesig, double empSal) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empDesig = empDesig;
		this.empSal = empSal;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpDesig() {
		return empDesig;
	}

	public void setEmpDesig(String empDesig) {
		this.empDesig = empDesig;
	}

	public double getEmpSal() {
		return empSal;
	}

	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}
	
	
	
}
