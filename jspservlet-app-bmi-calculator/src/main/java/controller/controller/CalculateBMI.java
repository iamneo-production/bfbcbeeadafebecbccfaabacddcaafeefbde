package controller;
import java.util.Scanner;
public class CalculateBMI {
    public static double calculate(double height,double weight){
        double bmi=weight/Math.pow(height,2);
        return bmi;
    }
    public static String description(double bmi){
        if(bmi<18.5){
            return "Under weight";
        }
        else if(bmi>=18.5 && bmi<=24.9){
            return "Normal";
        }
        else if(bmi>=25 && bmi<=29.9){
            return "Over Weight";
        }
        else if(bmi>=30 && bmi<=34.9){
            return "Obese";
        }
        else if(bmi>35){
            return "Extremely Obese";
        }
        return "Invalid";
    }
    public static void main(String[] args){
        CalculateBMI cb=new CalculateBMI();
        Scanner sc=new Scanner(System.in);
        double h=sc.nextDouble();
        double w=sc.nextDouble();
        System.out.println(cb.calculate(h,w));
        System.out.println(cb.description(cb.calculate(h,w)));
    }
}