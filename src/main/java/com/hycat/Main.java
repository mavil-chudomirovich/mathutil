package com.hycat;

import com.hycat.mathutil.core.MathUtility;

public class Main {
    public static void main(String[] args) {
//        testFactorialGiveRightArg0RunsWell();
//        testFactorialGiveRightArg5RunsWell();
        testFactorialGiveWrongArgMinus5ThrowException();
    }
    //Test case #4: Check getFactorial() method with invalid
    //parameter, e.g. n = -5
    //Steps/procedure:
    //  1. Given an invalid n, e.g. n = -5
    //  2. Call/invoke getFactorial(n = -5)
    //  3. Execute
    //Expected result:
    //  The method will throw an exception
    //Status:
    //  Pass | Failed
    public static void testFactorialGiveWrongArgMinus5ThrowException(){
        MathUtility.getFactorial(-5); //Passed, vì kì vọng ngoại lệ xuất hiện và ngoại lệ xuất hiện thật

    }
    //Test case #1l: Check getFactorial() method with valid
    //parameter, e.g. n = 0
    //Setps/procedure:
    //  1. Given a valid n, e.g. n = 0
    //  2. Call/invoke getFactorial(n = 0)
    //  3. Excute
    //Expected result:
    //  The method will return 1 as the result of 0!
    //Status:
    //  Pass | Failed
    public static void testFactorialGiveRightArg0RunsWell(){
        int n = 0; // đầu vào
        long expectiveValue = 1; //hope to see 0! = 1, kì vọng thoy

        //gọi hàm để xem actual value
        long actualValue = MathUtility.getFactorial(0);
        //test nè, so sánh actual vs expected
        //Dùng biến bool hoặc in ra
        System.out.println("0! expected: " + expectiveValue);
        System.out.println("0! actual: " + actualValue);
    }
    //Test case #2l: Check/Verify getFactorial() method with valid
    //parameter, e.g. n = 5
    //Setps/procedure:
    //  1. Given a valid n, e.g. n = 5
    //  2. Call/invoke getFactorial(n = 5)
    //  3. Excute
    //Expected result:
    //  The method will return 120 as the result of 5!
    //Status:
    //  Pass | Failed
    public static void testFactorialGiveRightArg5RunsWell(){
        int n = 5; // đầu vào
        long expectiveValue = 120; //hope to see 0! = 1, kì vọng thoy

        //gọi hàm để xem actual value
        long actualValue = MathUtility.getFactorial(5);
        //test nè, so sánh actual vs expected
        //Dùng biến bool hoặc in ra
        System.out.println("5! expected: " + expectiveValue);
        System.out.println("5! actual: " + actualValue);
    }

    //Test case #3l: Check getFactorial() method with valid
    //parameter, e.g. n = 6
    //Setps/procedure:
    //  1. Given a valid n, e.g. n = 6
    //  2. Call/invoke getFactorial(n = 6)
    //  3. Excute
    //Expected result:
    //  The method will return 620 as the result of 6!
    //Status:
    //  Pass | Failed
    public static void testFactorialGiveRightArgR6unsWell(){
        System.out.println("6! expected = 720 | actual = " + MathUtility.getFactorial((6)));
    }
}
