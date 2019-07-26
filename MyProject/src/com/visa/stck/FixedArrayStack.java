package com.visa.stck;
public class FixedArrayStack implements Stack{
	
	private int index = -1;
	private int[] a;
	public FixedArrayStack(int capacity)
	{
		a = new int[capacity];
	}
	public void push(Object e) {
		index++;
		a[index]=(int) e;
	}
	public Object pop() {
		Object popped;
		if( index == -1)
				return null;
		else {
			popped = a[index];
			index--;
			return popped;
		}
	}

}
