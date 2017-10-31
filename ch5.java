package challenge4.pkg9;

import java.util.Scanner;


public class Challenge49 {

    public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
        System.out.println("Enter your test score ");
        int score = sc.nextInt();
        
        System.out.println("Your score is: "+ score);
        if (score > 20) {
            System.out.println("You achieved an A ");
        }else if (score>=10&& score <=19) {
            System.out.println("You achieved a C ");
        }else{
            System.out.println("You failed the test");
        }
    }
    
}
