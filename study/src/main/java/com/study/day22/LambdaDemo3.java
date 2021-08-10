package com.study.day22;

//0805上午(第15堂) 2:45:55 (搭配BMI 介面)

public class LambdaDemo3 {

	public static void main(String[] args) {
		// 身高 170 體重 60 使用 BMI.java 介面並用 Lambda 求解
		BMI bmi = (h, w) -> w / Math.pow(h/100, 2);
		
		System.out.println(bmi.calc(170, 60));

	}

}
