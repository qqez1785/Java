package com.study.day05my;

import com.study.day05.BMImy;

public class HelloBMImy {

	public static void main(String[] args) {
		BMImy b1 = new BMImy("John", 170, 60);
		// 查看目前的屬性資料
//		System.out.println(b1.getName());
//		System.out.println(b1.getHeight());
//		System.out.println(b1.getWeight());
//		System.out.println(b1.getBmi());
		System.out.println(b1);
//		改寫TOSTRING後
		
		//變更身高
		b1.setHeight(180);
		System.out.println(b1);
		//重新設定身高後,但是Bmi還是沒有更改,所以要再重新計算
		
	
	}

}
