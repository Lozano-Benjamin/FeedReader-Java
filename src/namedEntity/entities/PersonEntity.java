package entities;

public class PersonEntity extends NamedEntity{
    private String personId;

    public PersonEntity(String name, String category, int frequency, String theme, String personId) {
        super(name, category, frequency, theme);
        this.personId = personId;
    }

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

}


