//***********************************************************************************************
//Name: Brent Miller
//Program Name: MilkProduced
//Date: 060415
//Class MilkProduced demonstrates how a user can enter a value then convert different values to a
//universal value. Then display the cost of production and profit margin of the product.
//All values are displayed using the DecimalFormat class to limit decimals to two spaces.
//***********************************************************************************************

import java.util.Scanner;//Scanner class which allows the user to read values of various types.
import java.text.DecimalFormat;//DecimalFormat class that allows you to format decimal numbers.

//Name of program
public class MilkProduced
{
	//Main 
	public static void main(String args[])
	{
		//Declaration and Initialization of variables
		Scanner in = new Scanner(System.in);
		DecimalFormat twoDecimal = new DecimalFormat("0.00");
		double milkCarton = 3.78;
		double productionCost = .38;
		double profitPerCarton = .27;
		double carton = 0;
		
		//Ask the user to input number of liters produced
		System.out.println("Please enter the amount of milk produced in liters: ");
				
		//Read in variables
		carton = in.nextDouble();
		
		//Reassign values to variables
		productionCost = productionCost * carton;
		profitPerCarton = profitPerCarton * carton;
		
		//Display production cost and profit to the user
		System.out.println("\nThe cost of producing milk is: $" + twoDecimal.format(productionCost));
		System.out.println("The profit of producing milk is: $" + twoDecimal.format(profitPerCarton));
		
		//Reassign values to variable
		carton = carton/milkCarton;		
		
		//Display number of cartons needed to store milk
		System.out.println("The number of cartons you will need to contain your milk is " + (int)carton);
				
	}//End main
}//End class MilkProduced