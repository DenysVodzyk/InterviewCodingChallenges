import java.util.*;

public class ScrambleGameString {

    public static void main(String[] args) {
        List<Character> list = new ArrayList<>();
        list.add('d');
        list.add('o');
        list.add('o');
        list.add('r');

        String word = "doork";
        int wildCard = 1;

        System.out.println(isCorrect(list, word, wildCard));
    }

    public static boolean isCorrect(List<Character> list, String word, int wildCard) {

        Map<Character, Integer> letters = new HashMap<>();

        for (Character c : list) {
            if (letters.containsKey(c)) {
                letters.put(c, letters.get(c) + 1);
            } else {
                letters.put(c, 1);
            }
        }

        for (int i = 0; i < word.length(); i++) {
            char character = word.charAt(i);
            if (letters.containsKey(character)) {
                if (letters.get(character) >= 1) {
                    letters.put(character, letters.get(character) - 1);
                } else if (wildCard > 0) {
                    wildCard--;
                } else {
                    return false;
                }
            } else if (wildCard > 0) {
                wildCard--;
            } else {
                return false;
            }
        }
        return true;
    }
}
