package com.study.day22;

import javax.swing.SwingConstants;

public class CircleAreaMain {

	public static void main(String[] args) {
		
		//0805上午(第15堂) 1:22:55
		
		//0805上午(第15堂) 1:30:00 ~ 下課 ~ 1:56:00
		
		// 若半徑 = 10, 求面積 = ?
		CircleArea circleArea = new CircleArea() {
			
			//實做出來 (系統自動生成) 
			
			@Override
			public double calc(double r, int type) {
				double result = 0;
				switch(type) {
					case CircleArea.AREA: // 1
						result = Math.pow(r, 2) * Math.PI;
						break;
					case CircleArea.VOLUMN: // 2
						result = 4/3 * Math.pow(r, 3) * Math.PI;
						break;
				}
				return result;
			}
		};
		
		System.out.println(circleArea.calc(10, CircleArea.AREA));
		System.out.println(circleArea.calc(10, 1));
		System.out.println(circleArea.calc(10, CircleArea.VOLUMN));
		System.out.println(circleArea.calc(10, 2));

	}

}
