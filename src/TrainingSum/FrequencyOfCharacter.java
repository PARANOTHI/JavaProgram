package TrainingSum;
import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;
public class FrequencyOfCharacter {

	public static void main(String[] args) {
		String l="vvvvvelalar";
		LinkedHashMap<Character,Integer> mp=new LinkedHashMap<>();
		for(char c:l.toCharArray()) {
			//System.out.println(c);
			if(mp.containsKey(c)) {
				mp.put(c,mp.get(c)+1);
			}
			else {
				mp.put(c,1);
			}
		}
		System.out.println(mp);
		int max=0;
		char ch=' ';
			for (Map.Entry<Character, Integer> it: mp.entrySet()) {
				if(it.getValue()>max) {
					max=it.getValue();
					ch=it.getKey();
				}
	        }
			System.out.println("Maximum Key: "+ch);
			System.out.println("Maximum Value: "+max);
			
		}
		

	}


