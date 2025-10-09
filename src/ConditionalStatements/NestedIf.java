package ConditionalStatements;

public class NestedIf {

	public static void main(String[] args) {
		int mark=-10;
		if(mark>0 && mark<=100) {
			if(mark<35) {
				System.out.println("Fail");
			}
			else if(mark>=35 && mark<50) {
				System.out.println("average");
			}
			else if(mark>=50 &&mark<85) {
				System.out.println("Good");
			}
			else if(mark>=85 && mark<=100) {
				System.out.println("Execllent");
			}
		else {
				System.out.println("invalid mark");
			}
		}

	}

}
