public class MaximumPossibleValue {
    public static void main(String[] args) {

        MaximumPossibleValue run = new MaximumPossibleValue();

        System.out.println(run.solution(-2859));

    }

    public int solution(int N) {
        int absoluteN = Math.abs(N);
        String numberToString = Integer.toString(absoluteN);
        int maxValue = Integer.MIN_VALUE;
        int inputLength = numberToString.length();

        if (N == 0) {
            maxValue = 50;
        } else {
            for (int i = 0; i <= inputLength; i++) {
                String testValueString = addNumberToString(numberToString, i);
                int testValue;
                if (N < 0) {
                    testValue = Integer.parseInt(testValueString) * -1;
                } else {
                    testValue = Integer.parseInt(testValueString);
                }
                if (testValue > maxValue) {
                    maxValue = testValue;
                }
            }
        }
        return maxValue;
    }

    private String addNumberToString(String numberToString, int i) {
        return new StringBuilder(numberToString).insert(i, 5).toString();
    }
}
