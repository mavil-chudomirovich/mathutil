package com.hycat.mathutil.core;

public class MathUtility {
    //class này chứa các hàm tiện ích dùng cho mọi nơi
    //hàm tiện ích dùng cho mọi nơi nghĩa là nó ko luu lại kết quả xử lí
    //của nó bên trong, vậy nó sẽ đc thiết kế là static method

    //hàm tính n! = 1.2.3...n; trong đó n phải > 0
    //quy ước 0! = 1, 1! = 1...
    //20! vừa đủ kiểu long, 18 con số 0; 21! long chứa k nổi
    // k có âm giai thừa
    //Bài này giai thừa chỉ tính từ 0 -> 20, ngoài vùng này gọi là k hợp lệ n!
    //0...20 -> valid boundary validated boundary - vùng giá trị hợp lệ
    //0...20 -> boundary value - biên giới của tập giá trị
    //          xích qua 1 xíu là sang vùng invalid boundary!!!
    //0, xích nhẹ sang trái 1 đơn vị, k ổn, k tính đc, -1 sao tính!!!
    public static long getFactorial(int n){
        if(n < 0 || n > 20){
            //ném ngoại lệ, kèm câu "chửi", và dừng hàm ngay, ko có value nào đc trả về!!!
            throw new IllegalArgumentException("n must be between 0 and 20");
        }

        //bến trung gian để tính phép nhân
        long result = 1;
        for (int i = 1; i <= n; i++){
            result *= i; // reuslt = result * i; thuật toán con heo đất, ốc bươu nhồi thịt, vào đây tiếp chiêu
        }
        return result;
    }
}
