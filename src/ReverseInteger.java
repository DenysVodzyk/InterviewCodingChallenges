public class ReverseInteger {

    public static void main(String[] args) {
        System.out.println(reverse(-2147483648));
    }

    public static int reverse(int x) {
        StringBuilder numberString = new StringBuilder();
        numberString.append(Math.abs((long)x));
        numberString.reverse();

        long output = Long.parseLong(String.valueOf(numberString));

        if (x < 0) {
            output *= -1;
        }

        if (output < Integer.MIN_VALUE || output > Integer.MAX_VALUE) {
            return 0;
        }
        return (int) output;
    }
}
