package ConditionalStatements;
import java.util.Scanner;
public class SwitchStatements {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the day :");
		int day=sc.nextInt();
		switch(day) {
		case 1:{
			System.out.println("Sunday");
			break;
		}
		case 2:{
			System.out.println("Monday");
			break;
		}
		case 3:{
			System.out.println("Tuesday");
			break;
		}
		case 4:{
			System.out.println("Wednesday");
			break;
		}
		case 5:{
			System.out.println("Thursday");
			break;
		}
		case 6:{
			System.out.println("Friday");
			break;
		}
		case 7:{
			System.out.println("Saturday");
			break; 
		}
		default:{ //we can write default in anywhere in the switch even 1st line
			System.out.println("Invalid Input");
		}
		}

	}

}
