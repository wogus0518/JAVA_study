package AccountingApp;

import java.util.Scanner;

public class AccountingIf {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Value of supply: ");

        double valueOfSupply = scanner.nextDouble();
        double vatRate = 0.1;
        double vat = valueOfSupply * vatRate;
        double total = vat + valueOfSupply;
        double expenseRate = 0.3;
        double expense = valueOfSupply * expenseRate;
        double income = valueOfSupply - valueOfSupply * expenseRate;
        double dividend1, dividend2, dividend3;
        if (income >= 10000){
            dividend1 = income * 0.5;
            dividend2 = income * 0.3;
            dividend3 = income * 0.2;
        } else {
            dividend1 = income;
            dividend2 = 0;
            dividend3 = 0;
        }

        System.out.println("VAT: " + vat);
        System.out.println("Total: " + total);
        System.out.println("Expense: " + expense);
        System.out.println("Income: " + income);
        System.out.println("Dividend1: " + dividend1);
        System.out.println("Dividend2: " + dividend2);
        System.out.println("Dividend3: " + dividend3);
    }
}
