import java.util.Scanner;

public class Conversions {
	
	public static void main(String arg[])	
	{
		
	
		double kelvin, pounds,miles,
		celsius,kilograms,kilometers ;
		
		Scanner sc= new Scanner(System.in); 
		
		System.out.println("Please Choose a number between 1 and 3 to Perform different conversion");
		
		int conversions=sc.nextInt();
		
		if (conversions ==1) {
			
			System.out.println("Provide Kelvin to get its equivalent value in celsius: ");
			
			kelvin =sc.nextDouble();
			
			celsius = kelvin - 273.15;
			
			System.out.println("Kelving  = "+ celsius);
		}
		
		else if (conversions ==2){
		    
		   System.out.println("Provide pounds get its equivalent value in kilograms");
			pounds =sc.nextDouble();
			
			kilograms = pounds/2.2046;
			
			System.out.println("Pounds = "+ kilograms);
		   
		}
	
	
		else if (conversions ==3){
		    
			System.out.println("Provide miles get its equivalent value in kilometers");
			miles =sc.nextDouble();
			
			kilometers = miles * 1.609344;
			
			System.out.println("Kilometers = "+ kilometers);
		   
		}	
	
}
	}


