package com.revature.eval.java.core;

import java.util.Scanner;

import com.revature.eval.java.core.EvaluationService.Triangle;

public class Driver {
	
	public static void main(String[] args) {
		EvaluationService novo = new EvaluationService();
		Scanner scan  = new Scanner(System.in);
		
		System.out.println("1.A Test: \nPassing argument less than 0:");
		System.out.println(EvaluationService.SpeedConverter.toMilesPerHour(-3));
		System.out.println("Argument greater than 0: ");
		double kmh = 50;
		System.out.println(kmh + " Km/h = " + EvaluationService.SpeedConverter.toMilesPerHour(kmh) + " m/h");
		
		divider();
		
		System.out.println("1.B Test: \nPassing argument less than 0:");
		System.out.println(EvaluationService.SpeedConverter.printConversion(-3));
		System.out.println("Argument greater than 0: ");
		System.out.println(EvaluationService.SpeedConverter.printConversion(60));
		
		divider();
		
		System.out.println("2. Test: \nPassing argument less than 0:");
		System.out.println(novo.printMegaBytesAndKiloBytes(-3));
		System.out.println("Argument greater than 0: ");
		System.out.println(novo.printMegaBytesAndKiloBytes(2500));
		
		divider();
		
		boolean barking;
		int hour;
		System.out.println("Test 3. Barking Dog \nPlease enter \"true\" or \"false\" for barking or not barking");//doing this test with user's input since there are many combinations of parameters and outcomes
		barking = true; //scan.nextBoolean(); <-- uncomment and eliminate value for user input
		System.out.println("Please enter a number from 0 to 23 corresponding to the hour of the day");
		hour = 23; // scan.nextInt(); <-- uncomment and eliminate value for user input
		System.out.println(novo.shouldWakeUp(barking, hour));
		
		divider();
		
		System.out.println("4. DecimalComparator: ");
		System.out.println("true check: ");
		System.out.println(novo.areEqualByThreeDecimalPlaces(-3.1756, -3.175));
		System.out.println("false check: ");
		System.out.println(novo.areEqualByThreeDecimalPlaces(4.0, 4.79));
		
		divider();
		
		System.out.println("5. Teen Number Checker: ");
		System.out.println("false check: ");
		System.out.println(EvaluationService.TeenNumberChecker.hasTeen(10, 11, 7));
		System.out.println("true check: ");
		System.out.println(EvaluationService.TeenNumberChecker.hasTeen(10, 15, 7));
		
		divider();
		
		System.out.println("6. Minutes To Years and Days Calculator: ");
		System.out.println(novo.printYearsAndDays(561600));
		
		divider();
		
		System.out.println("7. Numer In Word");
		System.out.println(novo.printNumberInWord(0));
		
		divider();
		
		System.out.println("8. Greatest Common Divisor");
		System.out.println(novo.getGreatestCommonDivisor(25, 15));
		
		divider();
		
		System.out.println("9. First and Last Digit Sum");
		System.out.println(novo.sumFirstAndLastDigit(123));
		
		divider();
		
		System.out.println("10. Reverse String");
		System.out.println(novo.reverse("moraes"));
		
		divider();
		
		System.out.println("11. Acronyms");
		System.out.println(novo.acronym("Young Mens christian association"));
		
		divider();
		
		System.out.println("12. Triangles");
		Triangle triangle = new Triangle(2,3,4);
		System.out.println(triangle.isEquilateral());
		System.out.println(triangle.isIsosceles());
		System.out.println(triangle.isScalene());
		
		divider();
		
		System.out.println("13. Scrabble Score");
		System.out.println(novo.getScrabbleScore("quirky"));
		
		divider();
		
		System.out.println("14. Clean the Phone Number");
		System.out.println(novo.cleanPhoneNumber("223 456   7890   "));
		
		divider();
		
		System.out.println("15. Recurring Word Counter");
		
	}
	
	public static void divider() {
		System.out.println("-------------------------------------");
	}
	
}
