package main.configuration;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;


import main.pojo.Employee;

public class MainClass {

	public static void main(String[] args) {
		Employee employee = new Employee(124,"ABC","Software Engineer",123.4);
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("persistanceUnit");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		manager.persist(employee);
		transaction.commit();
		
		
//		Query query = manager.createQuery("select *From employee_details");
//		List<Employee> empList = query.getResultList();
//		for(Employee emp:empList){
//			System.out.println(emp.getEmpId()+"....."+emp.getEmpName()+"....."+emp.getEmpSal()+"...."+emp.getEmpDesig());
//		}
	}
}
