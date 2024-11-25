package main;
import manager.Manager;
import employee.Employee;
public class Main {
	public static void main(String[] args){
		Employee employee = new Employee();
		System.out.println(employee.calsal(120000));
		
		Manager manager =new Manager();
		System.out.println(manager.calsal(123400, 2000));
	}
}
