
public class StringReverse {

    public static void main(String[] args) {
        reverseString("Hellok".toCharArray());
    }

    public static void reverseString(char[] s) {
        char start;
        char end;

        for (int i = 0; i < s.length / 2; i++) {
            start = s[s.length - i - 1];
            end = s[i];
            s[i] = start;
            s[s.length - i - 1] = end;
        }
    }
}
