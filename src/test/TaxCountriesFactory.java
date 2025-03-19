package test;

public class TaxCountriesFactory {

    public static TaxCountries getCountry(CountryCode countryCode){
        switch (countryCode){
            case INDIA -> {
                return new India();
            }default ->
                throw new IllegalArgumentException("Country not found");
        }
    }
}
