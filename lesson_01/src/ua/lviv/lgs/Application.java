package ua.lviv.lgs;

import java.util.Arrays;

public class Application {

	public static void main(String[] args) {
	
		//Завдання 1
		boolean yes = true;
		byte a = 0;
		short b = 1;
		int c = 2;
		long d = 3;
		float e = 4.4f;
		double f = 5.5;
		
		//Завдання 2
		System.out.println(Byte.MIN_VALUE);
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Short.MIN_VALUE);
		System.out.println(Short.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);
		System.out.println(Long.MAX_VALUE);
		System.out.println(Float.MIN_VALUE);
		System.out.println(Float.MAX_VALUE);
		System.out.println(Double.MIN_VALUE);
		System.out.println(Double.MAX_VALUE);
		
		//Завдання 3
		int [] array = new int [10];
		for (int i = 0; i < array.length; i++) {
			array[i] = i * i;
		}

		int min = Arrays.stream(array).min().getAsInt();
		int max = Arrays.stream(array).max().getAsInt();
		System.out.println("min = " + min + " max = " + max); 
}
}
	













