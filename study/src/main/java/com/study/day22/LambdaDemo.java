package com.study.day22;

//0805上午(第15堂) 2:18:55   (搭配 Add 介面)


public class LambdaDemo {

	public static void main(String[] args) {
		
		
		// 方法一 : 使用匿名內部類別實現 Add 介面 (搭配 Add 介面)
		Add add1 = new Add() {
			@Override
			public int calc(int x, int y) {
				return x + y;
			}
		};
		System.out.println(add1.calc(10, 20));
		
		
		
		// 方法二 : Lambda寫法 (內部類 縮減而來)
		
		Add add2 = (int x, int y) -> x + y;
		Add add3 = (x, y) -> x + y;
		
		System.out.println(add2.calc(10, 20));
		System.out.println(add3.calc(10, 20));
		
	}

}
