/* 
   10/28/14
   JDK 1.7
   Guessing game
 */
import javax.swing.JOptionPane;

public class GuessingGame {

    public static void main(String[] args) {
        int randomNum = (int) (Math.random() * 10 + 1);
        //System.out.println(randomNum);
        String response = JOptionPane.showInputDialog(null,
                "Enter a guess between 1 and 10");
        int guess = Integer.parseInt(response);
        //JOptionPane.showMessageDialog(null, "Your guess is "
        //        + determineGuess(randomNum, guess));
        seeGuess(randomNum, guess);
    }

    public static String determineGuess(int r, int g) {
        if (g < 1 || g > 10) {
            return "out of bounds";
        } else if (r == g) {
            return "correct";
        } else {
            return "incorrect";
        }
    }

    public static void seeGuess(int r, int g) {
        while (g < 1 || g > 10) {
            JOptionPane.showMessageDialog(null, "Your guess is out of bounds");
            String response = JOptionPane.showInputDialog(null,"Enter a guess between 1 and 10");
            g = Integer.parseInt(response);
        } if (r == g) {
            JOptionPane.showMessageDialog(null, "Your guess is correct");
        } else {
            JOptionPane.showMessageDialog(null, "Your guess is incorrect");
        }
    }
}
