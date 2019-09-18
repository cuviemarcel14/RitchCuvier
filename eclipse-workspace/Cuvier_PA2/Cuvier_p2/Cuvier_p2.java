package Cuvier_p2;
import java.util.Scanner;

public class Cuvier_p2 {

	public static void main(String[] args) {
	float weight, height,options,BMI;
	Scanner Scnr = new Scanner(System.in);
	System.out.println("Which method did you want to use?");
	System.out.println("Press 1 for In Pounds or press 2 for Kilograms?");
	options=Scnr.nextInt();
	if (options==1) 
	{
		System.out.println("Enter Weight ");
		weight=Scnr.nextFloat();
		System.out.println("Enter Height ");
		height=Scnr.nextFloat();
		height=(height)*(12);
		BMI=(703*(weight))/((height)*(height));
		System.out.println("BMI Is : "+BMI);
		
	System.out.println("BMI Categories: ");
	System.out.println("Underweight = <18.5");
	System.out.println("Normal weight = 18.5–24.9 5");
	System.out.println("Overweight = 25–29.9");
	System.out.println("Obesity = BMI of 30 or greater");
	}
	if (options==2) 
	{
		System.out.println("Enter Weight ");
		weight=Scnr.nextFloat();
		System.out.println("Enter Height ");
		height=Scnr.nextFloat();
		height=height*height;
		BMI=(weight)/(height);
		System.out.println("BMI Is : "+BMI);
	System.out.println("BMI Categories: ");
	System.out.println("Underweight = <18.5");
	System.out.println("Normal weight = 18.5–24.9 5");
	System.out.println("Overweight = 25–29.9");
	System.out.println("Obesity = BMI of 30 or greater");
	}
	}
	
}


