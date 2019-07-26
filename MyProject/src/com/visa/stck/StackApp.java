package com.visa.stck;

public class StackApp {

	public static void main(String[] args) {
		StackUser suser = new StackUser();
		FixedArrayStack s = new FixedArrayStack(10);
		int[] a = {1,2,3,4,5,6,7,8,9,10,11,12};
		suser.arr = a;
		suser.fill(s);
		suser.empty(s);
		
		

	}

}
