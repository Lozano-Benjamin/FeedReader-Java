package entities;

public class OtherPlaceEntity extends PlaceEntity {

    private String comments;

    public OtherPlaceEntity(String name, String category, int frequency, String theme, int population, String comments) {
        super(name, category, frequency, theme,population);
        this.comments = comments;
    }

    public void setComments (String comments){
        this.comments = comments;
    }

    public String getComments (){
        return this.comments;
    }
    
}
