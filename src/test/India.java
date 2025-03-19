package test;

public class India extends TaxCountries {

    private static final int taxRate = 10;

    @Override
    double calculateTax(double salary) {
        return 0;
    }
}
