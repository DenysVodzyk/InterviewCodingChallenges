import java.util.*;

public class FizzBuzz {

    public static void main(String[] args) {
        System.out.println(solution(100));
    }

    public static List<String> solution(int N) {
        List<String> output = new ArrayList<>();

        for (int i = 1; i <= N; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                output.add("FizzBuzz");
            } else if (i % 3 == 0) {
                output.add("Fizz");
            } else if (i % 5 == 0) {
                output.add("Buzz");
            } else {
                output.add(String.valueOf(i));
            }
        }
        return output;
    }
}