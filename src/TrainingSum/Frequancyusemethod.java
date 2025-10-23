package TrainingSum;
import java.util.LinkedHashMap;
import java.util.Map;
public class  Frequancyusemethod{
	static LinkedHashMap<Character,Integer>freqChar(String st){
		LinkedHashMap<Character,Integer>mp=new LinkedHashMap<>();
		for(char ch:st.toCharArray()) {
			if(mp.containsKey(ch)) {
				mp.put(ch, mp.get(ch)+1);
			}
			else {
				mp.put(ch,1);
			}
		}
		System.out.println(mp);
		return mp;
	}
	static char maxChar(String st) {
		LinkedHashMap<Character,Integer>op=freqChar(st);
		int max=0;
		char c=' ';
		for(Map.Entry<Character,Integer>it:op.entrySet()) {
			if(it.getValue()>max) {
				max=it.getValue();
				c=it.getKey();
			}
		}
//		System.out.println("Maximum Key: "+c);
//		System.out.println("Maximum Value: "+max);
		return c;
	}
	  
	
	public static void main(String[] args) {
		String st="vvvelalar";
		char op=maxChar(st);
		System.out.println(op);
	}
	
}