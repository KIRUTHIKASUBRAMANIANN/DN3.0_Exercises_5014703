package com.financialforecasting;

public class FinancialForecasting {

    // Recursive method to calculate future value
    public static double calculateFutureValue(double initialValue, double growthRate, int years) {
        // Base case: if no years are left, return the initial value
        if (years == 0) {
            return initialValue;
        }
        // Recursive case: apply the growth rate and decrease the years
        return calculateFutureValue(initialValue * (1 + growthRate), growthRate, years - 1);
    }

    public static void main(String[] args) {
        double initialValue = 1000.0; // Initial investment amount
        double growthRate = 0.05; // Annual growth rate of 5%
        int years = 10; // Number of years into the future

        // Calculate future value
        double futureValue = calculateFutureValue(initialValue, growthRate, years);
        System.out.printf("The future value of the investment is: %.2f%n", futureValue);
    }
}
