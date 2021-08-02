package com.study.day12;

import java.util.Arrays;

public class WrapperDemo5 {

	public static void main(String[] args) {
		
		//【0730-(第8堂)下午1  00:15:15 ~21:15  】
		
		Employee e1 = new Employee("John", 20, 40000);
		Employee e2 = new Employee("Mary", 30, 50000);
		Employee e3 = new Employee("Helen", 25, null);
		Employee e4 = new Employee("Jim", 40, 60000);
		Employee e5 = new Employee("Jack", 35, 55000);
		
		// 試問公司平均年齡 = ?
		
		//【0730-(第8堂)下午1 21:15 練習 ~ 26:35 】
		//【0730-(第8堂)下午1 26:35 ~ 34:27】
		
		Employee[] employees = {e1, e2, e3, e4, e5};
		
		double avgOfAge = Arrays.stream(employees)
			//.peek(System.out::println)
			.mapToInt(Employee::getAge)
			//.peek(System.out::println)
			.average()
			.getAsDouble();
		System.out.println(avgOfAge);
		
		// 試問公司平均薪資 = ?
		//【0730-(第8堂)下午1 34:27 練習 ~  43:18 】
		//【0730-(第8堂)下午1 43:18 ~ 50:00 】
		
		double avgOfSalary = Arrays.stream(employees)
			//.peek(System.out::println)
			.filter(emp -> emp.getSalary() != null)
			//.peek(System.out::println)
			.mapToInt(emp -> emp.getSalary())
			//.peek(System.out::println)
			.average()
			.getAsDouble();
		System.out.println(avgOfSalary);
	}

}
