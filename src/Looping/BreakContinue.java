package Looping;

public class BreakContinue {

	public static void main(String[] args) {
		System.out.println("Break Statement:");
		for(int i=1;i<=10;i++) {
			if(i==5) {
				break; // here break will be terminate the remaining iteration so it skip 5 to 10
			}
			System.out.println(i);
		}
		System.out.println("Continue statement:");
		for(int i=1;i<=10;i++) {
			if(i==5) {
				continue; 
// here it will skip only that particular value but execute remaining all the values thats the reason it will skip the 5 only.
			}
			System.out.println(i);
		}
		
	}

}
