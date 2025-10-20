package com.hycat.mathutil.core.test;

import com.hycat.mathutil.core.MathUtility;
import org.junit.jupiter.api.Test;
//import static chỉ dành cho những hàm static, để giúp ta làm biến gõ
//tên class chấm, lẽ ra phải là mathUtility.getFactorial(2) thì nay chỉ cần gõ
//getFactorial(5) là đủ
//giá sử class có nhiều hàm static thì ta đổi qua dấu *
//import static com.hycat.mathutil.core.MathUtility.getFactorial;
import static com.hycat.mathutil.core.MathUtility.*;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilityTest {

    @Test //@test là một cái ghi chú, đánh dấu, kí hiệu - annotation báo hiệu rằng
    //hàm này là hàm main() có thể run
    //1 class test có thể có nhiều @Test, vậy 1 class test có thể có nhiều hàm main() - để ứng với
    //nhiều kịch bản test, nhiều test case khác nhau đều đc run!!!
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
    public void testFactorialGiveRightArg0RunsWell(){
        int n = 0; // đầu vào
        long expectiveValue = 1; //hope to see 0! = 1, kì vọng thoy

        //gọi hàm để xem actual value
        long actualValue = getFactorial(n);
        assertEquals(expectiveValue, actualValue);
        //vietsub: só sánh xe 0! có trả về con số 1 hay
        //                             actual    expected

        assertEquals(1, getFactorial((0)));
        //                 expected                 actual
        //hàm assertEquals() so sánh giúp mình 2 value này, nó thảy ra
        //2 màu
        //Màu xanh passed nếu 2 giá trị bằng nhau
        //Màu đỏ failed  nếu 2 gi trị khác nhau
        //Nhìn bằng mắt
    }
    @Test
    public void testFactorialGiveRightArg5RunsWell(){
        assertEquals(120, getFactorial((5)));
    }

    @Test
    public void testFactorialGiveRightArg4RunsWell(){
        assertEquals(24, getFactorial((4)));
    }
}