public class PalindromeNumber {

    public static void main(String[] args) {
        System.out.println(isPalindrome(-10021));
    }

    public static boolean isPalindrome(int x) {
        String number = String.valueOf(x);
        for (int i = 0; i < number.length() / 2; i++) {
            if (number.charAt(i) != number.charAt(number.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
