/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe_test_swt;

/**
 *
 * @author vuvo0
 */
public class TestFunctions {
     public double calculateSalary(int yearsOfService, double basicSalary, double performanceRating) {
        if (yearsOfService < 0 || basicSalary <= 0 || performanceRating < 0 || performanceRating > 5) {
            throw new IllegalArgumentException("Invalid input values");
        }

        double bonus = 0.0;
        double deduction = 0.0;

        if (yearsOfService > 10) {
            bonus = 0.10 * basicSalary;
        } else if (yearsOfService >= 5) {
            bonus = 0.05 * basicSalary;
        }

        if (performanceRating < 3) {
            deduction = 0.05 * basicSalary;
        }

        return basicSalary + bonus - deduction;
        //Vu Doi code
    }


}
