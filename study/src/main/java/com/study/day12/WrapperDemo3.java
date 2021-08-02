package com.study.day12;

public class WrapperDemo3 {

	public static void main(String[] args) {
		
		//【0730-(第8堂)下午1  Start ~00:9:41】
		
		/*
		Integer[] exam = { 
							Integer.valueOf(100), 
							Integer.valueOf(90), 
							Integer.valueOf(80) 
						 };
		*/
		
		Integer[] exam = { 100, 90, 80 }; // auto-boxing
		int sum = 0;
		for(Integer e : exam) {
			System.out.println(e.getClass().getName() + ", " + e.intValue());
			//sum += e.intValue();
			sum += e; // e.intValue(); auto-unboxing 
		}
		System.out.println(sum);
		
	}

}
