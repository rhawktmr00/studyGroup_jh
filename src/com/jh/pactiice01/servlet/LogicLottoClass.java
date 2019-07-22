package com.jh.pactiice01.servlet;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.jh.common.LogicClass;
import com.jh.common.systemOutPrint;

public class LogicLottoClass extends LogicClass {

	public LogicLottoClass() {
		// TODO Auto-generated constructor stub
		super();
	}

	@Override
	public void run(Object o) {
		// TODO Auto-generated method stub
		Random lotto = new Random();
		List<Integer> numList = new ArrayList<>();
		
		for (int i = 1; i<= 50; i++) {
			
			int num = lotto.nextInt(50);
			new systemOutPrint(num);
//			numList.add(num);
//			for (Integer j : numList) {
//				
//				int num2 = j;
//				if (!j.equals(num2)) {
//					
//					new systemOutPrint(num);
//				} else {
//					break;
//				}
//			}
		}
	}

	}
