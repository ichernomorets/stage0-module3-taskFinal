package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        int digit1 = number / 100;
        int digit2 = number / 10 - digit1 * 10;
        int digit3 = number % 10;

        int reversed = digit3 * 100 + digit2 * 10 + digit1;
        System.out.println(reversed);
    }
}
