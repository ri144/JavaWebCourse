import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Person p = new Person();
		System.out.printf("Please input your name.\n");
		String first, mid, last;
		first = s.next();
		mid = s.next();
		last = s.next();
		p.setName(first, mid, last);
		System.out.println("Please input your email address");
		s.nextLine();
		p.setemail(s.nextLine(), first, last);
		int count = 0;
		while(count < 10){
			System.out.println("Please enter your educational experience ('degree', 'major', 'school', 'year')"
				+ " each on different lines");
			p.setEdu(s.nextLine(),s.nextLine(),s.nextLine(), s.nextLine());
			System.out.println("Do you have another educational experience to input? ('Y'/'N')");
			if (s.nextLine().equals("N")){
				break;
			}
			count++;
		}
		count = 0;
		while(count < 10){
			
			System.out.println("Do you have a work experience to input? ('Y'/'N')");
			if (s.nextLine().equals("N")){
				break;
			}
			System.out.println("Please enter data for your work experience ('position', 'company', 'startmonth', "
					+ "'startyear', 'endmonth', 'endyear', 'duty1', 'duty2')"
					+ " each on different lines\n If you are still employed, please enter the current month "
					+ "and year for 'endmonth' and 'endyear'");
			p.setWork(s.nextLine(),s.nextLine(),s.nextLine(), s.nextLine(), s.nextLine(),s.nextLine(),s.nextLine(), s.nextLine());
			count++;
		}
		count = 0;
		while(count < 20){
			System.out.println("Please enter your skill ('skill', 'proficiency')"
				+ "each on different lines");
			p.setSkill(s.nextLine(),s.nextLine());
			System.out.println("Do you have another skill to input? ('Y'/'N')");
			if (s.nextLine().equals("N")){
				break;
			}
			count++;
		}
		System.out.println("=============================================================");
		System.out.println(p.getName());
		System.out.println(p.getEmail());
		System.out.println("\nEducation");
		System.out.print(p.getEdu());
		System.out.println("Experience");
		System.out.print(p.getExp());
		System.out.println("Skills");
		System.out.print(p.getSkills());
		s.close();
	}
}
