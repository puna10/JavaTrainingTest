import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FindingDuplicate {

	public static void main(String[] args) {
		
		findingDuplicateCharacter("JAVA");
	}

	public static void findingDuplicateCharacter(String word) {
		char[] characters = word.toCharArray();
		Map<Character, Integer> charactersMap = new HashMap<Character, Integer>();
		for (Character c : characters) {
			if (charactersMap.containsKey(c)) {
				charactersMap.put(c, charactersMap.get(c) + 1);
			} else {
				charactersMap.put(c, 1);
			}
		}

		Set<Map.Entry<Character, Integer>> es = charactersMap.entrySet();
		System.out.println("List of duplicate characters in String: "+word);
		for (Map.Entry<Character, Integer> entry : es) {
			if (entry.getValue() > 1) {
				System.out.println("Character: "+entry.getKey()+ " and Time repeating:"+entry.getValue());
			}
		}
	}

}
