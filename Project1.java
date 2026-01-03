//William Hercules
//COMP110-Fall20205
//Project 1
import java.util.Scanner;

public class Project1 {
    public static void main(String[] args) {
      
        Scanner input = new Scanner(System.in);
      
        // name input 
        System.out.println("Enter your name:");
        String name = input.nextLine();
        if (name.length() == 0) {
            System.out.println("Error: Invalid String!");
            System.exit(0);
        }    
      

        // Integer input 
        System.out.println("Enter an integer number between 10 to 30:");
        if (!input.hasNextInt()) {
            System.out.println("Non-Integer Input Detected");
            System.exit(0);
        }
        int number = input.nextInt();
        input.nextLine();
        if (number < 10 || number > 30) {
            System.out.println("Invalid Integer Number");
            System.exit(0);
        }

        // Floating point input 
        System.out.println("Enter a floating point number between 0.44 to 0.66:");
        if (!input.hasNextDouble()) {
            System.out.println("Error: Non-Floating Point Input Detected");
            System.exit(0);
        }
        double fraction = input.nextDouble();
        if (fraction < 0.44 || fraction > 0.66) {
            System.out.println("Invalid Floating Point Number");
            System.exit(0);
        }
        //Calculations 
        final int constant = 2;//constant
        double result;
        int firstStep;
        if (number ==30) {
         firstStep = number + constant;               //addition
        }else if (number >= 25 && number <= 29) {
         firstStep = number - constant;             //subtraction
        } else if (number >=20 && number <=24){
         firstStep = number / constant;            //division
        } else { firstStep = number % constant;    //modulo
        
        }
        if (fraction >0.55 && fraction <= 0.66) {
         result = firstStep * fraction;               //multiplication
         } else { result = firstStep / fraction;      //division
        }
        
        // Success message
        System.out.println(name + ",your result is " + result);
        
        //Extra Credit 
            if(name.equalsIgnoreCase("bob")) {
        System.out.println(" How cool my grandpas name is also Bob!");
        
        

        }
        }
        }
           
       
