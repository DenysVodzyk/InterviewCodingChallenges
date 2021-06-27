
public class ThirdMaxNumber {

    public static void main(String[] args) {
        System.out.println(thirdMax(new int[]{1, 2, -2147483648}));
    }

    public static int thirdMax(int[] nums) {
        long maxValue1 = Long.MIN_VALUE;
        long maxValue2 = Long.MIN_VALUE;
        long maxValue3 = Long.MIN_VALUE;
        int counter = 0;

        for (int number : nums) {
            if (number == maxValue1 || number == maxValue2 || number == maxValue3) {
                continue;
            }
            counter++;
            if (number > maxValue1) {
                maxValue3 = maxValue2;
                maxValue2 = maxValue1;
                maxValue1 = number;
            } else if (number > maxValue2) {
                maxValue3 = maxValue2;
                maxValue2 = number;
            } else if (number > maxValue3) {
                maxValue3 = number;
            }
        }

        if (counter < 3) {
            return (int) maxValue1;
        }

        return (int) maxValue3;
    }
}
