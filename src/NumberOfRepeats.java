import java.util.HashMap;
import java.util.Map;

public class NumberOfRepeats {

    public static void main(String[] args) {
        String[] input = new String[]{"dog", "cat", "fish", "cat", "dog", "cat"};
        System.out.println(solution(input));
    }

    public static String solution(String[] input) {

        if (input.length == 0) {
            return null;
        }

        Map<String, Integer> words = new HashMap<>();
        int counter = 0;
        String output = null;

        for (String word : input) {
            if (words.containsKey(word)) {
                words.put(word, words.get(word) + 1);
                if (words.get(word) > counter) {
                    counter = words.get(word);
                    output = word;
                }
            } else {
                words.put(word, 1);
            }
        }
        return output;
    }
}