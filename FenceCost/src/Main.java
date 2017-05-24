import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Give length please (feet)");
		int length = sc.nextInt();
		System.out.println("Give width please (feet)");
		int width = sc.nextInt();
		int perim = 2*width + 2*length;
		System.out.println("Would you like a wooden or chain-link fence? ('wood' or 'chain')");
		String mat = sc.next();
		int cost =0;
		if (mat.equals("wood")){
			cost = 25;
		}
		else{
			cost = 15;
		}
		int gate_count = 4;
		do{
			System.out.println("How many gates would you like? (1-3)");
			gate_count = sc.nextInt();
			if (gate_count <1 || gate_count > 3){
				System.out.println("You must have at least one gate, but you can only have up to 3.");
			}
		}while(gate_count > 3);
		double total = 1.06*(cost*perim + 150 * gate_count) + 50;
		System.out.println("Total cost: " + total);
	}

}
