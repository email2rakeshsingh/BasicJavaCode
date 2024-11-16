package qa.rakesh.com;
import java.util.HashMap;
import java.util.Map;

public class CharOccrance {

	public static void main(String[] args) {

		String str = "Rakesh is good boy and working BirlaSoft";
		Map<Character, Integer> hasMap = new HashMap<>();
		char[] words = str.toCharArray( );
		for (char word : words) {
			if (hasMap.containsKey(words)) {
			hasMap.put(word, hasMap.get(word)+1);
			}else {
				hasMap.put(word, 1);			}
		}
		System.out.println(hasMap);
	}

}
