package com.study.day22;

//0805上午(第15堂) 2:29:55  (搭配Socore介面)

public class LambdaDemo2 {

	public static void main(String[] args) {
		// score : 75
		// score : 45
		// 直接用 lambda 語法求解 ?
		
		Score score1 = (int s) -> s >= 60 ;
		Score score2 = (int s) -> s >= 85 ;
		
		System.out.println(score1.isPassOrFail(75));
		System.out.println(score2.isPassOrFail(75));
		
	}

}
