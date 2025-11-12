package taxes;

public class TaxFromDebit extends TaxSystem{

    @Override
    public int calcTaxFor(int debit, int credit) {
        float tax = debit*0.06f;
        if (tax<0)
            return 0;
        else
            return (int) tax;
    }
}
