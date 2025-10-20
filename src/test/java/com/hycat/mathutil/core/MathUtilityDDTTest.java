package com.hycat.mathutil.core;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilityDDTTest {
        //Chuẩn bị bộ data  riêng, su đó fill vào lệnh test
        //mảng 2 chiều, gồm giá trị kì vọng| con n!
    public static Object[][] initTestData(){
        //trả về mảng 2 chiều
//        Object dataset = {.....0}  = {các phần tử của mảng}
//                                   = {5, 10, 15, 20}
        Object[][] dataset = {{5, 120},
                            {6, 720},
                            {4, 24},
                            {3, 6},
                            {2, 2},
                            {0, 10}}; // [7][2]
        return dataset;
    }
    @ParameterizedTest
    @MethodSource("initTestData")
    public void testFactorialGivenRightArgRunsWell(int n, long expected){
        assertEquals(expected, MathUtility.getFactorial((n)));
    }
}