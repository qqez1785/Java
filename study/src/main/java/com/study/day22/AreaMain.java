package com.study.day22;

//0805上午(第15堂) 1:14:05

public class AreaMain {

	public static void main(String[] args) {
		
		Area area = new Area() {
			
			//0805上午(第15堂) 1:16:05 (自動生成)

			@Override
			public int calc(int h, int w) {
				int result = h * w;
				return result;
			}
		};
		
		System.out.println(area.calc(10, 20));
		
		
	}

}
