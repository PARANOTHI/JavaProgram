package StringConcepts;

public class StrLettersChanges {

	public static void main(String[] args) {
		String str="PaRaNjOtHi Is a GoOd bOy";
		String res="";
		//for(int i=0;i<str.length();i++) {
		 for(int i=str.length()-1;i>=0;i--){ // for reverse
			char ch=str.charAt(i);
			if(ch>=97 &&ch<='z') {
				ch=(char)(ch-32);
			}
			else if(ch>='A' && ch<='Z') {
				ch=(char)(ch+32);
			}
			res=res+ch;
		}
		System.out.println(res);
	}

}
