import java.util.Scanner;

public class PorN {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a number!");
        int number = keyboard.nextInt();

        keyboard.nextLine();
        
        String posNeg;
        if (number < 0){
            posNeg = "Negative";
        } else {
            posNeg = "Positive";
        }

        System.out.println(number + " is " + posNeg);
    }
}
