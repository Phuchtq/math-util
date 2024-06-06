/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.namnguyen.mathutil.core.test;

import com.namnguyen.mathutil.core.MathUtility;
import com.namnguyen.mathutil.main.MathUtil;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

/**
 *
 * @author pc
 */
public class MathUtilityDDTTest {
    
   // Ta chuẩn bị bộ data đưa vào hàm getFactorial(int n) và cũng chuẩn bị luôn bộ data kết quả trả về từ hàm
    // 0! hy vọng 1
    // 1! hy vọng 1
    // 2! hy vọng 2
    // 3! hy vọng 6
    // 4! hy vọng 24
    // 5! hy vọng 120
    // 6! hy vọng 720
    // {0, 1}, {1, 1}, {2, 2}, {3, 6}, {4, 24}, {5, 120}, {6, 720}
    
    public static Object[][] initData() {
        return new Object[][]{
            {0, 1}, 
            {1, 1}, 
            {2, 2}, 
            {3, 6}, 
            {4, 24}, 
            {5, 120}, 
            {6, 720}
        };
    }
    
    @ParameterizedTest
    @MethodSource("initData")
    public void testFactorialGivenRightArgReturnsWell(int n, long expected) {
        assertEquals(expected, MathUtility.getFactorial(n));
    }
    
}
