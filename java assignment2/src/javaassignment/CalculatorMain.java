package javaassignment;

import java.util.Scanner;

public class CalculatorMain implements Calculator {

	@Override
	public double add(int x, int y) {
		int z = x + y;
		System.out.println(z);
		return z;
	}

	@Override
	public double sub(int x, int y) {
		int z = x - y;
		System.out.println(z);
		return z;
	}

	@Override
	public double mul(int x, int y) {
		int z = x * y;
		System.out.println(z);
		return z;
	}

	@Override
	public double div(int x, int y) {
		int z = x / y;
		System.out.println(z);
		return z;
	}

	public static void main(String[] args) {
		Calculator c = new CalculatorMain();
		Scanner sc = new Scanner(System.in);
		while(true) {
        System.out.println(" Welcome to Calcultor");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("Enter the choice !!");
        int choice = sc.nextInt();
        System.out.println("Enter the values");
        int x = sc.nextInt();
        int y = sc.nextInt();
		switch (choice) {
		case 1: {
			c.add(x, y);
			break;	
		}
		case 2 : {
			c.sub(x,y);
			break;
		}
		case 3 : {
			c.mul(x, y);
			break;
		}
		case 4 : {
			c.div(x, y);
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: ");
		}
	}
	}
}
