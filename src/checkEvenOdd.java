/*
 * Created by: IntelliJ IDEA
 * User: Abhinandan Padmakar Pandey
 * Date: 9th January 2020
 */

public class checkEvenOdd {
    public static void main(String[] args) {
        int countEven = 0;
        int countOdd = 0;
        for (String arg : args) {
            try {
                int a = Integer.parseInt(arg);
                if (a != 0) {
                    if (a / 2 == 0) {
                        countEven++;
                    } else {
                        countOdd++;
                    }
                }
            } catch (Exception e) {
                System.out.println("Given element must be integer, " + e);
            }
        }
        System.out.println("Number of even and odd numbers are " + countEven + " and " + countOdd+" respectively.");
    }
}
