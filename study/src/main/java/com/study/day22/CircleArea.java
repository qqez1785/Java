package com.study.day22;

// 圓面積/球體積   //0805上午(第15堂) 1:22:55 (方法二)
public interface CircleArea {
	int AREA   = 1; // 面積
	int VOLUMN = 2; // 體積
	
	// 計算 (半徑 = r, type=1面積, 2體積)  //0805上午(第15堂) 55:55 (方法一)
	double calc(double r, int type);
}
