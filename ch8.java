package challenge8.pkg13;

import java.util.Scanner;

public class Challenge813 {

    
    public static void main(String[] args) {
      System.out.println("Welcome to your personal btec calculator");
      Scanner trevor = new Scanner(System.in);
      System.out.println("Insert 1st number");
      int Number1 = trevor.nextInt();
      System.out.println("Insert 2nd number");
      int Number2 = trevor.nextInt();
      System.out.println("Enter if you would like to add, subtract, divide or mulitply these numbers.");
      String input = trevor.next();
      
        if(input.equals("add")) {
          System.out.println(Number1+Number2);              
        } else if(input.equals("subtract")) {
            System.out.println(Number1-Number2);
        } else if(input.equals("multiply")) {
            System.out.println(Number1*Number2);
        } else if(input.equals("divide")) {
            System.out.println(Number1/Number2);
        }
    }
}
