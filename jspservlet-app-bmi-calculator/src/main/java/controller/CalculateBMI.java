package controller;

public class CalculateBMI {

	//Enter the code here....

	public static double calculate(double height, double weight)
	{
	 double bmi = weight / (height * height);
	 return bmi;
   }
 
   public static String description(double bmi)
	{
	 if (bmi < 18.5) 
	 {
	   return "Underweight";
	 } 
	 else if (bmi >= 18.5 && bmi < 24.9)
	{
	   return "Normal";
	 } 
	 else if (bmi >= 25 && bmi < 29.9)
	  {
	   return "Overweight";
	 }
	  else if (bmi >= 30 && bmi < 34.9) 
	  {
	   return "Obese";
	 }
	  else
	   {
	   return "Extremely Obese";
	 }
   }
}
