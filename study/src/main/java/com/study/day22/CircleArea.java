package com.study.day22;

//0805上午(第15堂) 55:55
//0805上午(第15堂) 1:22:55

// 圓面積/球體積
public interface CircleArea {
	int AREA   = 1; // 面積
	int VOLUMN = 2; // 體積
	// 計算 (半徑 = r, type=1面積, 2體積)
	double calc(double r, int type);
}
