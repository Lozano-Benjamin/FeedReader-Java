package entities;

public class AddressEntity extends PlaceEntity {
    private String city;
    public AddressEntity(String name, String category, int frequency, String theme, int population, String city) {
        super(name, category, frequency,theme, population);
        this.city = city;
    }

    public void setCity(String city){
        this.city = city;
    }

    public String getCity(){
        return this.city;
    }
    
}
