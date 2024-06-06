/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.namnguyen.mathutil.core.test;
// Quy tắc đặt tên package trong Java: tên miền đảo ngược, đi kèm thông tin dự án/project và module
// com.tên-cty.tên-dự-án.module.class
// com.microsoft.sqlserver.jdbc.
// com.namnguyen.mathutil.core.
// .NET: chiều xuôi, chữ hoa từng đầu từ
// Microsoft.sqlserver.jdbc
// Microsoft.SDK;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import com.namnguyen.mathutil.core.MathUtility;

/**
 *
 * @author pc
 */
// Class này chứa các test case chứa code để test các class chính bên MathUtility
public class MathUtilityTest {

    // Framework is a kind of Libs - But not the opposite, providing to dev in form of file .JAR
    // Must follow the structure of framework but freely with lib without any code strict rules
    // Test case: bộ data đầu vào + thao tác nhập xuất trên app, màn hình,hàm để verify
    // 1 hàm, màn hình, chức năng chạy đúng hay sai!!!
    // TC1: check/test getF() with n = 0
    // * Input/given: n = 0
    // * Steps/Procedures (bước test):
    //    call method getFactorial(n)
    // * Expected result: 1 (hy vọng 0! = 1)
    // * Actual reuslt: ??? cho chạy hàm mới biết
    // * Status: passed | failed
    // Framework ép ta viết code theo 1 quy tắc nào đó, thư viện cho viết tự do
    // -> Framework là thư viện nhưng thư viện ko hẳn là framework
    @Test
    public void testFactorialGivenRightArg0ReturnWell() {
        assertEquals(1, MathUtility.getFactorial(0));
    }

    // TC2: check/test getF() with n = 1
    // * Input/given: n = 1
    // * Steps/Procedures (bước test):
    //    call method getFactorial(n)
    // * Expected result: 1 (hy vọng 1! = 1)
    // * Actual reuslt: ??? cho chạy hàm mới biết
    // * Status: passed | failed// TC1: check/test getF() with n = 1
    // * Input/given: n = 1
    // * Steps/Procedures (bước test):
    //    call method getFactorial(n)
    // * Expected result: 1 (hy vọng 1! = 1)
    // * Actual reuslt: ??? cho chạy hàm mới biết
    // * Status: passed | failed
    @Test
    public void testFactorialGivenRightArg1ReturnWell() {
        assertEquals(1, MathUtility.getFactorial(1));
    }

    // TC3: check/test getF() with n = 5
    // * Input/given: n = 5
    // * Steps/Procedures (bước test):
    //    call method getFactorial(n)
    // * Expected result: 1 (hy vọng 5! = 120)
    // * Actual reuslt: ??? cho chạy hàm mới biết
    // * Status: passed | failed// TC1: check/test getF() with n = 5
    // * Input/given: n = 5
    // * Steps/Procedures (bước test):
    //    call method getFactorial(n)
    // * Expected result: 120 (hy vọng 5! = 120)
    // * Actual reuslt: ??? cho chạy hàm mới biết
    // * Status: passed | failed
    @Test
    public void testFactorialGivenRightArg5ReturnWell() {
        assertEquals(120, MathUtility.getFactorial(5));
    }

    // TC4:
    @Test
    public void testFactorialGivenRightArg12345ReturnWell() {
        assertEquals(1, MathUtility.getFactorial(1));
        assertEquals(2, MathUtility.getFactorial(2));
        assertEquals(6, MathUtility.getFactorial(3));
        assertEquals(24, MathUtility.getFactorial(4));
    }
    
    // Thấy ngoại lệ mừng rơi nước mắt
    // TC#5: Check getF() with n = -1, the method throws exception
    @Test 
    public void testFactorialGivenWrongArg_1ThrowException() {
        // MathUtility.getFactorial(-1);
        assertThrows(IllegalArgumentException.class, () -> {MathUtility.getFactorial(-1);});
    }
}
