package com.bridgelabz.generic;

import org.junit.Test;

public class MaxTest {

	@Test
	public void findIntMax() {
		
		GenericCal gc = new GenericCal();
		
		int a = (int) (Math.random() * 1000);
		int b = (int) (Math.random() * 1000);
		int c = (int) (Math.random() * 1000);
		
		System.out.println(gc.findMax(a, b, c));
	}
	
	@Test
	public void findFloatMax() {
		GenericCal gc = new GenericCal();
		float a = (float) (Math.random() * 1000);
		float b = (float) (Math.random() * 1000);
		float c = (float) (Math.random() * 1000);
		
		System.out.println(gc.findMax(a, b, c));
	}
	
	@Test
	public void findStringMax() {
		GenericCal gc = new GenericCal();
		String a = "Apple";
		String b = "Peach";
		String c = "Banana";
		
		System.out.println(gc.findMax(a, b, c));
	}

}
