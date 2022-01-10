package AccountingApp;

import java.util.Scanner;

public class AccountingApp {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Value of supply: ");
        double valueOfSupply = 10000;
        double vatRate = 0.1;
        double vat = valueOfSupply * vatRate;
        double total = vat + valueOfSupply;
        double expenseRate = 0.3;
        double expense = valueOfSupply * expenseRate;
        double income = valueOfSupply - valueOfSupply * expenseRate;
        double dividend1 = income * 0.5;
        double dividend2 = income * 0.3;
        double dividend3 = income * 0.2;

        System.out.println("Value of supply: " + valueOfSupply);
        System.out.println("VAT: " + vat);
        System.out.println("Total: " + total);
        System.out.println("Expense: " + expense);
        System.out.println("Income: " + income);
        System.out.println("Dividend1: " + dividend1);
        System.out.println("Dividend2: " + dividend2);
        System.out.println("Dividend3: " + dividend3);
    }
}
