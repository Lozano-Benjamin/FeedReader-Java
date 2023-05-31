package entities;

public class TitleEntity extends PersonEntity {

    private String canonical;
    private String professional;

    public TitleEntity(String name, String category, int frequency, String theme, String personId, String canonical, String professional) {
        super(name, category, frequency, theme, personId);
        this.professional = professional;
        this.canonical = canonical;
    }

    public void setCanonical(String canonical){
        this.canonical = canonical;
    }

    public void setProfesional (String professional){
        this.professional = professional;
    }

    public String getCanonical () {
        return this.canonical;
    }

    public String getProfesional () {
        return this.professional;
    }
    
}
