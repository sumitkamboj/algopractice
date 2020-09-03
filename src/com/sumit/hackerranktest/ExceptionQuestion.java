package com.sumit.hackerranktest;

import java.io.IOException;


public class ExceptionQuestion {
	int err() throws Exception{
		try {
			throw new IOException("..");
		}catch(RuntimeException e) {
			throw new RuntimeException(e);
		}
		finally {
			return -1;
		}
	}
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
//		Game game = new Cricket();
//		game.play();
//		game = new Football();
//		game.play();
	
		ExceptionQuestion t = new ExceptionQuestion();
		t.err();
	}
}
