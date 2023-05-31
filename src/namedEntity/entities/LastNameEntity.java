package entities;

public class LastNameEntity extends PersonEntity {
    private String origin;
    private String canonical; 

    public LastNameEntity(String name, String category, int frequency, String theme,  String personId, String origin, String canonical) {
        super(name, category, frequency, theme, personId);
        this.origin = origin;
        this.canonical = canonical;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getCanonical(){
        return canonical;
    }

    public void setCanonical(String canonical){
        this.canonical = canonical;
    }
}
