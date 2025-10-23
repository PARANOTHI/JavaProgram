package StringConcepts;

public class WordCount {

	public static void main(String[] args) {
		String str="kavin is a best coder good boy";
		String arr[]=str.split(" ");
		int count=0;
		for(String ch:arr) {
			count++;
		}
		System.out.println("Words Count: "+count);
		System.out.println("Space Count: "+(count-1));

	}

}
