package entities;


public class DateEntity extends NamedEntity {

    private String precisalDate;
    private String canonicalDate;

    public DateEntity(String name, String category, int frequency, String theme, String precisalDate, String canonicalDate) {
        super(name, category, frequency, theme);
        this.precisalDate = precisalDate;
        this.canonicalDate = canonicalDate;
    }

    public void setPrecisalDate(String precisalDate){
        this.precisalDate = precisalDate;
    }

    public void setCanonicalDate(String canonicalDate){
        this.canonicalDate = canonicalDate;
    }

    public String getCanonicalDate(){
        return this.canonicalDate;
    }

    public String getPrecisalDate(){
        return this.precisalDate;
    }
    
}
