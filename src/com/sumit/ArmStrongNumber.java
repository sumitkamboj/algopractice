package com.sumit;

public class ArmStrongNumber {
	
	public void checkArmStrongNumber(int number) {
		int temp=number;
		int sum = 0;
		while(number>0) {
			int r = number%10;
			sum = sum+(r*r*r);
			number = number/10;
		}
		if(temp == sum) {
			System.out.println("armstrong");
		}
		else {
		System.out.println("not Asrmstrong");
		}
	}
	
	
	public static void main(String[] str) {
		int number = 407;
		ArmStrongNumber arm = new ArmStrongNumber();
		arm.checkArmStrongNumber(number);

	}

}
