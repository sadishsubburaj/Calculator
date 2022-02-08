package main;

import java.util.Scanner;
import util.Operations;

public class Calculator {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		Operations op = new Operations();
		int result = 0;
		int num1 = obj.nextInt();
		int num2 = obj.nextInt();
		System.out.println("Please enter the option 1.add 2.sub 3.mul 4.div");
		int choice = obj.nextInt();
		switch(choice) {
		case 1 : result = op.add(num1, num2);
		         break;
		case 2 : result = op.sub(num1, num2);
        		 break;
		case 3 : result = op.multiply(num1, num2);
        		 break;
		case 4 : result = op.div(num1, num2);
         	     break;	
		}
        System.out.println(result);
	}
}
