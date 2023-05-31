package entities;

import java.util.List;

public class FirstNameEntity extends PersonEntity {
    private String origin;
    private List<String> alternativeForms;
    private String canonical;

    public FirstNameEntity(String name, String category, int frequency, String theme, String personId, String origin, List<String> alternativeForms, String canonical) {
        super(name, category, frequency, theme, personId);
        this.origin = origin;
        this.alternativeForms = alternativeForms;
        this.canonical = canonical;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public List<String> getAlternativeForms() {
        return alternativeForms;
    }

    public void setAlternativeForms(List<String> alternativeForms) {
        this.alternativeForms = alternativeForms;
    }
    
    public String getCanonical() {
        return canonical;
    }

    public void setCanonical(String canonical) {
        this.canonical = canonical;
    }

}