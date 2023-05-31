package entities;

public class OrgEntity extends NamedEntity{
    private String canonical;
    private String type;
    private int members;

    public OrgEntity(String name, String category, int frequency, String theme, String orgaId, String canonical, String type, int members) {
        super(name, category, frequency, theme);
        this.canonical = canonical;
        this.type = type;
        this.members = members;
    }

    public String getCanonical() {
        return this.canonical;
    }

    public void setCanonical(String canonical) {
        this.canonical = canonical;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getMembers() {
        return this.members;
    }

    public void setMembers(int members) {
        this.members = members;
    }

}