package AccountingApp;

import java.util.Scanner;

public class AccountingArrayLoop {
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

        double[] dividendRates = {0.5, 0.2, 0.2, 0.1};
        double[] dividend = new double[dividendRates.length];
        for (int d=0; d<dividendRates.length; d++) {
            dividend[d] = income * dividendRates[d];
        }

        System.out.println("VAT: " + vat);
        System.out.println("Total: " + total);
        System.out.println("Expense: " + expense);
        System.out.println("Income: " + income);
        for (int d=0; d< dividend.length; d++){
            System.out.println(String.format("Dividend%d: %f",d+1,dividend[d]));
        }
    }
}
