package com.study.day14;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class GenericTypeDemo {
    public static void main(String[] args) {
    	
    	//【0802-(第9堂)＿38:46
    	
        // 無泛型 or <Object>
        LinkedHashSet scores = new LinkedHashSet();
        scores.add("國文"); // String
        scores.add(100);   // Integer
        scores.add("數學"); // String
        scores.add(90);    // Integer
        
        Iterator iter = scores.iterator();
        int sum = 0;
        while (iter.hasNext()) {
            Object next = iter.next();
            if(next instanceof Integer) {
                System.out.println(next);
                sum += (Integer)next; // 將 Object 轉成 Integer
            }
        }
        System.out.println(sum);
        
        
        
        // 有泛型
        LinkedHashSet<Integer> scores2 = new LinkedHashSet<>();
        scores2.add(100);
        scores2.add(90);
        Iterator<Integer> iter2 = scores2.iterator();
        int sum2 = 0;
        while (iter2.hasNext()) {
            //Integer next = iter2.next();
            //sum2 += next;
            sum2 += iter2.next();
        }
        System.out.println(sum2);
        
        
      //【0802-(第9堂)＿1:00:00 ~ 1:14:50  
      //【0802-(第9堂)  1:14:50 下課 ~ 1:35:50 
        
        // 有泛型 + Java8
        // 取得總分
        int sum3 = scores2.stream() // Integer 串流
                //.mapToInt(score -> score.intValue()) // IntStream
                .mapToInt(score -> score) // IntStream
                .sum();
        System.out.println(sum3);
    }
}
