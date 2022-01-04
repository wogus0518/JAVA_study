package AccountingApp;

import java.util.Scanner;

public class AccountingMethod {

    public static Scanner scanner = new Scanner(System.in);
    public static double valueOfSupply = scanner.nextDouble();
    public static double vatRate = 0.1;
    public static double expenseRate = 0.3;
    public static double[] dividendRates = {0.5, 0.2, 0.2, 0.1};
    public static double[] dividend = new double[dividendRates.length];
    public static double vat = getVat();
    public static double total = getTotal();
    public static double expense = getExpense();
    public static double income = getIncome();

    public static void main(String[] args){
        calDividend();
        print();
    }

    private static void print() {
        System.out.println("VAT: " + vat);
        System.out.println("Total: " + total);
        System.out.println("Expense: " + expense);
        System.out.println("Income: " + income);
        for (int d=0; d< dividend.length; d++){
            System.out.println(String.format("Dividend%d: %f",d+1,dividend[d]));
        }
    }

    private static void calDividend() {
        for (int d=0; d<dividendRates.length; d++) {
            dividend[d] = getIncome() * dividendRates[d];
        }
    }

    private static double getIncome() {
        return valueOfSupply - valueOfSupply * expenseRate;
    }

    private static double getExpense() {
        return valueOfSupply * expenseRate;
    }

    private static double getTotal() {
        return getVat() + valueOfSupply;
    }
    
    private static double getVat() {
        return valueOfSupply * vatRate;
    }
}
