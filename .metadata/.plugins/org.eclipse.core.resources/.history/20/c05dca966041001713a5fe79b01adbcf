import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		Random r = new Random();
		int x = 1 + r.nextInt(10);
		while(true){
			System.out.println("Enter your number: ");
			int y = sc.nextInt();
			if(y == x){
				System.out.println("You guessed correctly, congrats!");
				break;
			}
			else if(y<x){
				System.out.println("You guessed too low, try again? (Y/N)");
			}
			else{
				System.out.println("You guessed too high, try again? (Y/N)");
			}
			if(sc.next().equals("N")){
					System.out.println("Quitters never win");
					break;
			}	
		}
	}
}
