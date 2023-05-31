package entities;

public class PlaceEntity extends NamedEntity {
    private int population;
    public PlaceEntity(String name, String category, int frequency, String theme, int population) {
        super(name, category, frequency, theme);
        this.population = population;
    }

    public int getPopulation(){
        return this.population;
    }
    
    public void setPopulation(int population){
        this.population = population;
    }
}
