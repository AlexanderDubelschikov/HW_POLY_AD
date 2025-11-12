package taxes;

public class TaxFromDebitMinusCredit extends TaxSystem {

    @Override
    public int calcTaxFor(int debit, int credit) {
        float tax = (debit-credit)*0.15f;
        if (tax<0)
            return 0;
        else
            return (int) tax;
    }
}
