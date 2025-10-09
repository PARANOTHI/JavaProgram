package Looping;

public class numberprint_noloop {
	public static void main(String[] args) {
		int i=5;
		for(;i>0;) { // for(;i<=5;i++) or for(i=1;i<=5;i++)
			System.out.println(i);
			i--;
			
		}
		System.out.println(i);
		 
		/* for(stmt1;condition;stmt3){
				Stmt2;
	}
	
-> stmt1 runs only once 
-> then it will go to condition after that it will go to 
stmt2 and go for stmt3 then it will return to condition 
then stmt2 then stmt 3 it will repeat until condition become false.
*/
	}

}
