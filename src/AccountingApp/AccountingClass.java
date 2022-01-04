package AccountingApp;

class AccountingCal{
    public static double valueOfSupply = 10000;
    public static double vatRate = 0.1;
    public static double expenseRate = 0.3;
    public static double[] dividendRates = {0.5, 0.2, 0.2, 0.1};
    public static double[] dividend = new double[dividendRates.length];
    public static double vat = getVat();
    public static double total = getTotal();
    public static double expense = getExpense();
    public static double income = getIncome();

    public static void print() {
        System.out.println("VAT: " + vat);
        System.out.println("Total: " + total);
        System.out.println("Expense: " + expense);
        System.out.println("Income: " + income);
        for (int d=0; d< dividend.length; d++){
            System.out.println(String.format("Dividend%d: %f",d+1,dividend[d]));
        }
    }

    public static void calDividend() {
        for (int d=0; d<dividendRates.length; d++) {
            dividend[d] = getIncome() * dividendRates[d];
        }
    }

    public static double getIncome() {
        return valueOfSupply - valueOfSupply * expenseRate;
    }

    public static double getExpense() {
        return valueOfSupply * expenseRate;
    }

    public static double getTotal() {
        return getVat() + valueOfSupply;
    }

    public static double getVat() {
        return valueOfSupply * vatRate;
    }
}

public class AccountingClass {
    public static void main(String[] args){
        AccountingCal.calDividend();
        AccountingCal.print();

        AccountingCal a1 = new AccountingCal();
        a1.valueOfSupply = 20000;
        a1.vatRate = 0.05;
        a1.calDividend();
        a1.print();

    }

}


