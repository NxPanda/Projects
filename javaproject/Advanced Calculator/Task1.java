package javaproject;
import java.util.*;
public class Task1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Boolean runTimes = true; 
		while(runTimes) {
		System.out.println("Enhanced Calculator");
		System.out.println("Enter Options to Perform Certain Operation!!");
		System.out.println("1.Addition(+)");
		System.out.println("2.Subtraction(-)");
		System.out.println("3.Multiplication(*)");
		System.out.println("4.Division(/)");
		System.out.println("5.Square Root");
		System.out.println("6.Exponentiation");
		System.out.println("7.Currancy");
		System.out.println("8.Temperature");
		System.out.println("9.Trigonometric");
		System.out.println("Enter '10' to Exit the Calculator");
		int choice = s.nextInt();
		switch(choice) {
		case 1:{
			System.out.println("Enter first digit: ");
			double d1 = s.nextDouble();
			System.out.println("Enter second digit: ");
			double d2 = s.nextDouble();
			System.out.println("The Value is : " + add(d1,d2));
			break;
		}
		case 2:{
			System.out.println("Enter first digit: ");
			double d1 = s.nextDouble();
			System.out.println("Enter second digit: ");
			double d2 = s.nextDouble();
			System.out.println("The Value is : " + sub(d1,d2));
			break;
		}
		case 3:{
			System.out.println("Enter first digit: ");
			double d1 = s.nextDouble();
			System.out.println("Enter second digit: ");
			double d2 = s.nextDouble();
			System.out.println("The Value is : " + mul(d1,d2));
			break;
		}
		case 4:{
			System.out.println("Enter first digit: ");
			double d1 = s.nextDouble();
			System.out.println("Enter second digit: ");
			double d2 = s.nextDouble();
			System.out.println("The Value is : " + div(d1,d2));
			break;
		}
		case 5:{
			System.out.println("Enter a Digit: ");
			double d1 = s.nextDouble();
			double squareroot = Math.sqrt(d1);
			System.out.println(squareroot);
			break;
		}
		case 6:{
			System.out.println("Enter base digit: ");
			double d1 = s.nextDouble();
			System.out.println("Enter exponent digit: ");
			double d2 = s.nextDouble();
			System.out.println("The Value is : " + Math.pow(d1,d2));
			break;
		}
		case 7:{
			System.out.println("Enter a Dollar to convert it into Rupees");
			double d1 = s.nextDouble();
			System.out.printf("The Dollar in Rupees: %.2f\n",d1*83.97);
			break;
		}
		case 8:{
			temperatureCheck(s);
			break;
		}
		case 9:{
			trigonometric(s);
			break;
		}
		case 10:{
			runTimes = false;
			break;
		}
		default:{
			System.out.println("Enter a correct choice!!");
			break;
		}
		}
		}
		System.out.println("Thanks for Using the Calculator");
		s.close();
	}
	
	public static double add(double a,double b) {
		return a+b;
	}
	
	public static double sub(double a,double b) {
		return a-b;
	}
	
	public static double mul(double a,double b) {
		return a*b;
	}
	
	public static double div(double a,double b) {
		if(b == 0) {
			System.out.println("Dividing by zero is not possible!!");
			return 0;
		}
		return a/b;
	}
	
	public static void trigonometric(Scanner s) {
		System.out.println("Enter a Angle: ");
		double angle = s.nextDouble();
		System.out.println("Enter a choice");
		System.out.println("1.Sine");
		System.out.println("2.Cosine");
		System.out.println("3.Tangent");
		int cho = s.nextInt();
		switch(cho) {
		case 1:{
			System.out.println("The value for the Angle " + (int)angle + " for Sine is: " + (int)Math.sin(angle));
			break;
		}
		case 2:{
			System.out.println("The value for the Angle " + (int)angle + " for Cosine is: " + (int)Math.cos(angle));
			break;
		}
		case 3:{
			System.out.println("The value for the Angle " + (int)angle + " for Cosine is: " + (int)Math.tan(angle));
			break;
		}
		default:{
			System.out.println("Invalid Choice!!");
			break;
		}
		}
	}
	
	public static void temperatureCheck(Scanner s) {
        System.out.println("Select Temperature Conversion:");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.println("3. Celsius to Kelvin");
        System.out.println("4. Kelvin to Celsius");
        System.out.println("5. Fahrenheit to Kelvin");
        System.out.println("6. Kelvin to Fahrenheit");
        int choice = s.nextInt();
        System.out.println("Enter temperature: ");
        double temp = s.nextDouble();
        double result = 0;
        switch (choice) {
            case 1:
                result = celsiusToFahrenheit(temp);
                System.out.println("Temperature in Fahrenheit: " + result);
                break;
            case 2:
                result = fahrenheitToCelsius(temp);
                System.out.println("Temperature in Celsius: " + result);
                break;
            case 3:
                result = celsiusToKelvin(temp);
                System.out.println("Temperature in Kelvin: " + result);
                break;
            case 4:
                result = kelvinToCelsius(temp);
                System.out.println("Temperature in Celsius: " + result);
                break;
            case 5:
                result = fahrenheitToKelvin(temp);
                System.out.println("Temperature in Kelvin: " + result);
                break;
            case 6:
                result = kelvinToFahrenheit(temp);
                System.out.println("Temperature in Fahrenheit: " + result);
                break;
            default:
                System.out.println("Invalid choice.");
                break;
        }
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }
    
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }
    
    public static double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }
    
    public static double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }
    
    public static double fahrenheitToKelvin(double fahrenheit) {
        return (fahrenheit - 32) * 5/9 + 273.15;
    }
    
    public static double kelvinToFahrenheit(double kelvin) {
        return (kelvin - 273.15) * 9/5 + 32;
    }
}
