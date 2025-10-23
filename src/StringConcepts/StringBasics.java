package StringConcepts;
import java.util.Arrays;

public class StringBasics {

	public static void main(String[] args) {
		String s1="Jothi";
		String s2=new String("Jothi");
		String s3="Jothi";
		String s4=new String("Jothi");
		String s5=new String("jothi");
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s2==s4);
		// Here it checks only the memory address if the address is same then it will print true
		
		System.out.println(s1.equals(s2));
		//.equals() is used to check the value inside the memory address
		
		System.out.println(s2.equalsIgnoreCase(s5));
		// here .equalsIgnoreCase() didn't care the case sensitivity
		
		System.out.println(s1.length());
		//.length() used to find out the length of the string 
		
		System.out.println(s1.compareTo(s2));
		System.out.println(s2.compareTo(s5));
		System.out.println(s2.compareToIgnoreCase(s5));
		// .compareTo() it will compare the same index ASCII value

		String st1=new String(" Hello i am paranjothi   ");
		System.out.println(st1.toUpperCase());
		System.out.println(st1.toLowerCase());
		
		System.out.println(st1.charAt(4));
		
		System.out.println(st1.trim());
		//.trim() will remove first and last space in string
		
		System.out.println(st1.indexOf("Hello"));
		System.out.println(st1.indexOf('p'));
		System.out.println(st1.indexOf("a",10));
		System.out.println(st1.indexOf("a",4,20));
		//.indexOf() is used to find a index position of the char or string.
		
		
		System.out.println(st1.lastIndexOf("i"));
		
		System.out.println(st1.contains("jothi"));
		//.contains() returns true or false here we can string as a parameter
		
		System.out.println(st1.substring(1));
		System.out.println(st1.substring(1,10));
		//substring() can be accessed by with index number can check between the range also
		
		System.out.println(st1.endsWith("   "));
		
		System.out.println(st1.repeat(2));
		System.out.println(st1.replace("   "," B.Tech - IT  "));
		System.out.println(st1.replaceAll("[   ]","1"));
		// .replace() replace the first Occurrence 
		
		//for split the each char in string
		char ch[]=st1.toCharArray();
		ch[3]='x';
		String res=new String(ch);
		System.out.println(Arrays.toString(ch));
		System.out.println(res);
		System.out.println(ch.length);

		
		for(char k:ch) {
			System.out.print(k+" ");
		}
		
		String str1="kavin is a best coder";
		String arr[]=str1.split(" ");
		System.out.println();
		System.out.println(arr.length);
	}

}
