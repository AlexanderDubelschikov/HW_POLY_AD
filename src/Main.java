import taxes.TaxFromDebit;
import taxes.TaxFromDebitMinusCredit;
import taxes.TaxSystem;

public class Main {
    public static void main(String[] args) {

        TaxSystem taxSystem1 = new TaxFromDebit();
        TaxSystem taxSysyem2 = new TaxFromDebitMinusCredit();
        Company Apple = new Company("Apple", taxSystem1);

        Apple.shiftMoney(1000);
        Apple.payTaxes();
        Apple.setTaxSystem(taxSysyem2);
        Apple.shiftMoney(1000);
        Apple.payTaxes();
        Apple.shiftMoney(-1000);
        Apple.payTaxes();
    }
}