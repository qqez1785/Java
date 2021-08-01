package com.study.day05my;

//封裝版BMI

public class BMImy {
	private String name;
	private double height;
	private double weight;
	private double bmi;
	
	
	public double getBmi() {
		return bmi;
	}

	public BMImy(String name, double height, double weight) {
		super();
		this.name = name;
		this.height = height;
		this.weight = weight;
		this.bmi =  calcBmi ();
	}
	 
	private double calcBmi () {
		return weight / Math.pow(height/100 , 2) ;
		
		
	}

	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		this.bmi = calcBmi();  //bmi要重新計算
		return "BMImy [name=" + name + ", height=" + height + ", weight=" + weight + ", bmi=" + bmi + "]";
	}
	
	

}
