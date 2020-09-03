package com.sumit;

public class FindMinMax {

	public static void main(String[] args) {
		int[] list = {1,15,25,80,2,88,89,111};
		FindMinMax fmm = new FindMinMax();
		fmm.findMinMax(list);
		fmm.thirdLargest(list);

	}
	
	public void findMinMax(int[] list) {
		int min=0,max=0;
		min = list[0];
		max = list[0];
		for(int x=0; x<list.length; x++) {
		
			if(min>list[x]) {
				min = list[x];
			}
			else if (max<list[x]){
				max = list[x];
			}
			
		}
		System.out.println("min :"+min);
		System.out.println("max :"+max);
	}
 public void thirdLargest(int[] list) {
	 int thirdLargest=0,temp=0;
		for(int i=0; i<list.length; i++) {
			for(int j=i+1; j<list.length; j++) {
				if(list[i]>list[j]) {
					temp=list[i];
					list[i]=list[j];
					list[j]=temp;
				}
				
				
			}
						
			/*
			 * if (thirdLargest<list[x]){ thirdLargest = list[x]; }
			 */
			
		}
		for(int x:list) {
		//	System.out.println(x);	
		};
		System.out.println("Third largest element :"+list[(list.length-3)]);
	 
 }
}
