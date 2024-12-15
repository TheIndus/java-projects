import java.util.*;
import javax.swing.*;

public class Multiplication {
    public static void main(String[] args){
        Random random = new Random();
         int min = 2;
         int max = 20;

         int rng1 = random.nextInt((max-min) + 1) + min;
         int rng2 = random.nextInt((max-min) + 1) + min;
         System.out.println(rng1);
         System.out.println(rng2);

         String input = JOptionPane.showInputDialog(null, "What's " + rng1 + "*" + rng2 + "?", JOptionPane.QUESTION_MESSAGE);

            try {
                int userInput = Integer.parseInt(input);
                System.out.println("int input is " + userInput);
                if (userInput == rng1 * rng2) {
                    JOptionPane.showMessageDialog(null, "Correct!", "Info", JOptionPane.INFORMATION_MESSAGE);
                   } else {
                    JOptionPane.showMessageDialog(null, "Wrong!", "Info", JOptionPane.INFORMATION_MESSAGE);
                   }
                
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Error - You either didn't entered anything or didn't enter an integer", "Info", JOptionPane.ERROR_MESSAGE);
            }

   }
}
