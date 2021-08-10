package com.study.day22;

//0805上午(第15堂) 

class Job {
	// 方法
	void start() {
		int year = 2021; // 方法區域變數
		                 // 若此變數要給方法內部類別
		                 // 則編譯器會在背後加上 final 來修飾 (Java8 : 系統固定是 final) 35:00 
		
		//  year = 2021 ; (無法修改) 37:00
		// 方法內部類別
		class Report {
			void content() {
				System.out.println(year + "年度報告");
			}
		}
		// 建立
		Report report = new Report();
		report.content();
	}
	
	void other() {
		
		class Report {
			
		}
		
	}
	
}

public class MethodClass {
	public static void main(String[] args) {
		Job job = new Job();
		job.start();
	}
}
