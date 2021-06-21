public class ReverseString {

    public static void main(String[] args) {
        System.out.println(solutionBuilder("Test String."));
        System.out.println(solutionString("Test String."));

    }

    public static String solutionBuilder(String input) {
        return new StringBuilder(input).reverse().toString();
    }

    public static String solutionString(String input) {
        StringBuilder output = new StringBuilder();

        for (int i = input.length() - 1; i >= 0; i--) {
            output.append(input.charAt(i));
        }

        return output.toString();

    }


}
