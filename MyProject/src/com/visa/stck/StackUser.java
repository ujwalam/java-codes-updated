package com.visa.stck;

public class StackUser {
	public int[] arr;
	public void fill(Stack s) {
		for(int i=0;i<10;i++) {
			s.push(arr[i]);
			System.out.println(arr[i]);
		}
			
	}
	public void empty(Stack s) {
		for(int i=0;i<10;i++)
		{
			int p = (int)s.pop();
			System.out.println(p);
		}
	}

}
