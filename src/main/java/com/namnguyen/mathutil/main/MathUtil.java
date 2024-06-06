/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.namnguyen.mathutil.main;

import com.namnguyen.mathutil.core.MathUtility;
import javax.swing.JOptionPane;

/**
 *
 * @author pc
 */
public class MathUtil {

//    public static void main(String[] args) {
//        int n;
//        long actualValue;
//        long expectedValue;
//        
//        //Test case 1:  0!
//        n = 0;
//        expectedValue = 1;
//        actualValue = MathUtility.getFactorial(n);
//        System.out.println("Test case 1 - n = 0:");
//        System.out.println("Expected value: " + expectedValue + " | Actual value: " + actualValue);
//        
//        //Test case 2: 5!
//        n = 5;
//        expectedValue = 120;
//        actualValue = MathUtility.getFactorial(n);
//        System.out.println("Test case 2 - n = 5:");
//        System.out.println("Expected value: " + expectedValue + " | Actual value: " + actualValue);
//        
//        // Test case 3: 21!
//        n = 21;
//        actualValue = MathUtility.getFactorial(21);
//        System.out.println("Test case 3 - n = 21:");
//        System.out.println("Actual value: " + actualValue);
//    }
    public static void main(String[] args) {
        int n;
        long actualValue;
        long expectedValue;

        // Cách 2: Test hàm = cách popup
        n = 0;
        expectedValue = 1;
        actualValue = MathUtility.getFactorial(n);
        String result = n + "! | Expected: " + expectedValue + " | Actual: " + actualValue;
        System.out.println("Test case 1 - n = 0:");
        JOptionPane.showMessageDialog(null, result);
    }
    
    
}
