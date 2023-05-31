package multiple;
import entities.CountryEntity;
import themeInter.International;

// This class is a child of CountryEntity and implements the International interface

public class CountryInternat extends CountryEntity implements International{
    
    public CountryInternat(String name, String category, int frequency, String theme, int population, String language) {
        super(name, category, frequency, theme, population, language);
    }

}