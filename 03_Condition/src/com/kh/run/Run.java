package com.kh.run;

import com.kh.condition.ConditionElse;
import com.kh.condition.ConditionIf;
import com.kh.condition.ConditionSwitch;
import com.kh.loop.LoopFor;
import com.kh.loop.LoopWhile;

public class Run {
	public static void main(String[] args) {
		//ConditionIf c = new ConditionIf();
		//c.method0();
		//c.quiz();
		//ConditionElse ce = new ConditionElse();
		//ce.method1();
		//ce.method2();
		//ce.ageCheck();
		//ConditionSwitch cs = new ConditionSwitch();
		// cs.method0();
		//cs.method2();
		LoopFor lf = new LoopFor();
		//lf.method0();
		//lf.method1();
		//lf.gugudan();
		LoopWhile lw = new LoopWhile();
		//lw.method2();
		//lw.generateLottoNumber();
		
		//System.out.println("부릅니다~~");
		//lw.method4();
		//System.out.println("다녀왔습니다~~");
		lw.checkId();
	}
}
