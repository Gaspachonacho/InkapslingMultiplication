package lab4;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		//////////////////////////////////////////////////////////////
		
		Scanner scan = new Scanner(System.in);
		
		// Skannar in x och y värdet
		System.out.print("x: ");
		int xAxis = scan.nextInt();
		
		System.out.print("y: ");
		int yAxis = scan.nextInt();
		
		// Ber användaren vilket räknesätt de vill använda
		System.out.print("Välj räknesätt: +-/*");
		scan.nextLine();
		String raknesatt = scan.nextLine();
		
		// Beroende på vilket räknesätt användaren har valt, skall switchen printa ut den operatorns tabell
		ArithmeticTable c = null;
		switch (raknesatt) {
		
		case "+":
			c = new AdditionTable(xAxis, yAxis);
			break;
		case "-":
			c = new SubtractionTable(xAxis, yAxis);
			break;
		case "*":
			ArithmeticTable tableMultiply = new MultiplicationTable(xAxis, yAxis);
			tableMultiply.print();
			break;
		case "/":
			ArithmeticTable tableDivide = new DivisionTable(xAxis, yAxis);
			tableDivide.print();
			break;
		}
		c.print();
	}
}
