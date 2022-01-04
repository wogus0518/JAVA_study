package AccountingApp;

import java.util.Scanner;

public class AccountingArray {
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

        double[] dividendRates = {0.5, 0.3, 0.2};
        double dividend1 = income * dividendRates[0];
        double dividend2 = income * dividendRates[1];
        double dividend3 = income * dividendRates[2];

        System.out.println("VAT: " + vat);
        System.out.println("Total: " + total);
        System.out.println("Expense: " + expense);
        System.out.println("Income: " + income);
        System.out.println("Dividend1: " + dividend1);
        System.out.println("Dividend2: " + dividend2);
        System.out.println("Dividend3: " + dividend3);
    }
}
