/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.namnguyen.mathutil.core;
// C#: NamNguyen.MathUtil
//     Microsoft.MathUtil
// Quy tắc đặt tên package trong Java"
// Chữ thường toàn tập
// Ghi theo tên miền cty đảo ngược
// com(Comercial).tên-công-ty.tên-dự-án.tên-module-nhóm-chức-năng
// com.microsoft.sqlserver.jdbc.Tên-class (import vào để dùng)
// -> Đây là kĩ thuật giúp code của nhiều dự án trong 1 cty có thể chung folder mà ko bị lẫn lộn
// Giúp thư viện của các cty khác nhau ở chung với nhau dù trùng tên

/**
 *
 * @author pc
 */
public class MathUtility {
    // Hàm tính n! = 1.2.3.4.5... n
    // Hàm là static vì tính xong rồi trả về thôi ko nhớ nhung gì cả
    // Thường các thư viện dùng chung có tính toán số liệu ta hay dùng static
    // Quy ước 0! = 1! = 1
    // Bài này chỉ tính n từ 1 - 21 vì n = 21 thì 21! vượt quá long
    public static long getFactorial(int n) {
        long product = 1; // Tích - kết quả phép nhân
        // Update code again to see green again 4ever
        if (n < 0 || n > 20)
            throw new IllegalArgumentException("Invalid n, n must be between 0 to 20");
        if (n == 0 || n == 1)
            return 1;
        //for (int i = 1; i <= n; i++) 
            //product *= i; // Thuật toán tiếp chiêu nhân dồn, con heo đất
                          // Ốc bu nhồi thịt
                          
         // Đệ quy - recursion: Gọi là chính mình với 1 quy mô khác
        return n * getFactorial(n - 1);    
    }
    
    
}


// 5! = 1 * 2 * 3 * 4 * 5
// 5! = 5 * 4!
// 4! = 4 * 3!
// 3! = 3 * 2!
// 2! = 2 * 1!
// 1! = 1
// n! = n * (n - 1)!
// Đệ quy: gọi lại chính mình với 1 quy mô nhỏ hơn - recursion