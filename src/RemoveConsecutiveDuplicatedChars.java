public class RemoveConsecutiveDuplicatedChars {

    public static void main(String[] args) {
        System.out.println(solution("aAb"));
    }

    public static String solution(String input) {
        StringBuilder inputToLowerCase = new StringBuilder(input.toLowerCase());
        StringBuilder output = new StringBuilder();
        int inputLength = input.length();

        if (inputLength < 2) {
            return input;
        }

        for (int i = 0; i < inputLength; i++) {
            if (i == 0) {
                output.append(inputToLowerCase.charAt(i));
            } else {
                if (inputToLowerCase.charAt(i) != inputToLowerCase.charAt(i - 1)) {
                    output.append(inputToLowerCase.charAt(i));
                }
            }
        }
        return output.toString();
    }
}
