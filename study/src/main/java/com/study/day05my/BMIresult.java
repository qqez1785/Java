package com.study.day05my;

public class BMIresult {
	private String result ;
	private BMImy bmi ;
	
	
	public String getResult() {
		return result;
	}


	public BMIresult(BMImy bmi) {
		//super();
		this.bmi = bmi;
		//分析
		
		double bmivalue =this.bmi.getBmi();
		
		if(bmivalue > 23) {
			result = "過胖";
		} else if (bmivalue <= 18) {
			result = "過輕";
		} else {
			result = "正常";
		}
	
	
	
	}

	


}
