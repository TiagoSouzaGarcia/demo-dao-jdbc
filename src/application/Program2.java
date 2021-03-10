package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;
import model.entities.Seller;

public class Program2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

		
		  System.out.println("=== TEST 1: department insert =====");
		  System.out.println("Enter name for insert test: ");
		  String departmentName = sc.nextLine();
		  Department newDepartment = new Department(null, departmentName);
		  departmentDao.insert(newDepartment); System.out.println("Inserted! New id = "
		  + newDepartment.getId());
		 

		System.out.println("\n=== TEST 2: department findById =====");
		Department department = departmentDao.findById(3);
		System.out.println(department);

		System.out.println("\n=== TEST 3: department update =====");
		department = departmentDao.findById(6);
		department.setName("Forniture");
		departmentDao.update(department);
		System.out.println("Update completed!");
		
		System.out.println("\n=== TEST 4: department findAll =====");
		List<Department> list = departmentDao.findAll();
		for (Department obj :list) {
			System.out.println(obj);
		}
		
		System.out.println("\n=== TEST 5: department delete =====");
		System.out.println("Enter id for delete test: ");
		int id = sc.nextInt();
		departmentDao.deleteById(id);
		System.out.println("Delete completed!");
		sc.close();
	}

}
