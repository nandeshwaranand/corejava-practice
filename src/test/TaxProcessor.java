package test;

/**
 * I need to write a class which has a method to calculate taxes, it should accept country code and salary as input
 * If the country code is India, the tax is flat 10%
 * If the country code is UK, the tax is flat 15%
 * If country code is Denmark, tax is 40% for amount above 500000
 */
public class TaxProcessor {

    public static void main(String[] args) {
        double salary = 0;
        String str = "String";

        TaxCountries taxCountries = TaxCountriesFactory.getCountry(CountryCode.INDIA);
        taxCountries.calculateTax(salary);
    }
}
