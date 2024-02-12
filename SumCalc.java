import java.util.Random;
import javax.swing.JOptionPane;

public class SumCalc {
    public static void main(String[] args) {
        Random rand = new Random();
        int count = 0;

        String cont = JOptionPane.showInputDialog("Are you ready? y/n?");

        while(cont.equals("y")) {
            int number1 = rand.nextInt(100);
            int number2 = rand.nextInt(100);

            String answerStr = JOptionPane.showInputDialog("What is " + number1 + " + " + number2 + "?");
            int answer = Integer.parseInt(answerStr);

            if(answer == number1 + number2) {
                JOptionPane.showMessageDialog(null, "You are correct! :)");
            } else {
                while (answer != number1 + number2 && count < 3) {
                    answerStr = JOptionPane.showInputDialog("Sorry, that's wrong. Try again! You have " + (3-count) + " trial(s) left!");
                    answer = Integer.parseInt(answerStr);
                    count += 1;

                    if(answer == number1 + number2) {
                        JOptionPane.showMessageDialog(null, "You are correct! :)");
                        break;
                    }

                    if(count == 3) {
                        JOptionPane.showMessageDialog(null, "You have no tries left! " + number1 + " + " + number2 + " = " + (number1 + number2));
                    }
                }
            }

            cont = JOptionPane.showInputDialog("Again? y/n?");
        }
    }
}
