import java.util.Scanner;
import java.util.Random;

public class SumCalc{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.println("Are you ready? y/n?");
		String cont = input.nextLine();
		int count = 0;
		while(cont.equals("y")){
		int number1 = 1 + rand.nextInt(10);
		int number2 = 1 + rand.nextInt(10);			
		System.out.println("What is " + number1 + " + " + number2 + "?");
		int answer = input.nextInt();
		if(answer == number1 + number2) System.out.println("You are correct!:)");
		else if(answer != number1 + number2){
			while (answer != number1 + number2 && count < 3){
				System.out.println("Sorry, that's wrong. Try again! You have " + (3-count) + " trial(s) left!\n" + "What is " + number1 + " + " + number2 + "?");
				count += 1;
				answer = input.nextInt();
				if(answer == number1 + number2){
					System.out.println("You are correct!:)");
					count = 0;
					break;
				}
				if(count == 3){
					System.out.println("You have no tries left!\n" + number1 + " + " + number2 + " = " + (number1 + number2));
				}
			}
		} //System.out.println("Sorry, that's wrong. " + number1 + " + " + number2 + " = " + (number1 + number2));
		input.nextLine();
		System.out.println("Again? y/n?");
		cont = input.nextLine();
		count = 0;
		}
	}
}
