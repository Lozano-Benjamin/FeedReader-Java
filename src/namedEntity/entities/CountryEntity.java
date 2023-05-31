package entities;

public class CountryEntity extends PlaceEntity {
    private String languageOficial;
    public CountryEntity(String name, String category, int frequency, String theme, int population, String language) {
        super(name, category, frequency, theme, population);
        this.languageOficial = language;
    }

    public String getOficialLanguage (){
        return this.languageOficial;
    }

    public void setOficialLanguage(String language){
        this.languageOficial = language;
    }
    
}
