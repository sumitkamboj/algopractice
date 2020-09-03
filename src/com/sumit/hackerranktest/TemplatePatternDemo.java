package com.sumit.hackerranktest;

import java.io.IOException;

public class TemplatePatternDemo{
	static final Integer i1 = 1;
	final Integer i2 = 2;
	Integer i3 = 3;
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
//		Game game = new Cricket();
//		game.play();
//		game = new Football();
//		game.play();
		
	 final Integer i4 = 4;
	 Integer i5 = 5;
	class Inner{
		final Integer i6 = 6;
		Integer i7 = 7;
		Inner(){
			System.out.println(i6+i7);
		}
	}
	Inner t = new Inner();
	
	}

}
