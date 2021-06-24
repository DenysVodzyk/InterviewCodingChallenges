import java.util.HashMap;
import java.util.Map;

public class NumberOccurrenceCount {

    public static void main(String[] args) {

        int[] input = new int[]{1, 2, 3, 4, 5, 2, 3, 2, 2};
        System.out.println(solution(input));
    }

    public static Map<Integer, Integer> solution(int[] input) {

        Map<Integer, Integer> output = new HashMap<>();

        for (int number : input) {
            if (output.containsKey(number)) {
                output.put(number, output.get(number) + 1);
            } else {
                output.put(number, 1);
            }
        }
        return output;
    }
}
