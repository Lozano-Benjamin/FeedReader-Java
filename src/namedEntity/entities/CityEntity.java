package entities;

public class CityEntity extends PlaceEntity {
    private String country;
    private String capital;
    public CityEntity(String name, String category, int frequency, String theme, int population, String country, String capital) {
        super(name, category, frequency, theme, population);
        this.country = country;
        this.capital = capital;
    }

    public void setCountry(String country){
        this.country = country;
    }

    public void setCapital(String capital){
        this.capital = capital;
    }

    public String getCapital(){
        return this.capital;
    }

    public String getCountry(){
        return this.country;
    }
}
