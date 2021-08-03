package com.study.day16;


//【0803 下午1】    2:02:00~2:16:00

//final class A {
class A {	
	//final void play() {
	void play() {
		System.out.println("Play A");
	} 
}

class B extends A {
	@Override
	void play() {
		System.out.println("Play B");
	}
}

public class ExtendsDemo1 {

	public static void main(String[] args) {
		//final int x = 100;
		//x = 200;
		final int y;
		y = 100;
		//y = 200;
				

	}

}
