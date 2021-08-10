package com.study.day22;

public class SayHelloMain {
	public static void main(String[] args) {
		// case 1    //0805上午(第15堂) 55:55
		SayHello sayHello = new SayHelloImpl();
		sayHello.hello("John");
		
		// case 2 使用匿名內部類別  //0805上午(第15堂) 1:05:05
		
		SayHello sayHello2 = new SayHello() {

			// SayHello 是一個介面, 無法new , 但是透過匿名內部類,可以New (系統自動生成 override )
			
			@Override
			public void hello(String name) {
				System.out.println("Hi " + name);
			}
			
		};
		
		sayHello2.hello("Mary");
	}
	
}
