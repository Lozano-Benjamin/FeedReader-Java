package entities;

import java.util.Date;

public class EventEntity extends NamedEntity{
    private String canonicalForm;
    private Date date;
    private String recurrent;

    public EventEntity(String name, String category, int frequency, String theme, String canonicalForm, Date date, String recurrent) {
        super(name, category, frequency, theme);
        this.canonicalForm = canonicalForm;
        this.date = date;
        this.recurrent = recurrent;
    }

    public String getCanonicalForm() {
        return canonicalForm;
    }

    public void setCanonicalForm(String canonicalForm) {
        this.canonicalForm = canonicalForm;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getRecurrent() {
        return recurrent;
    }

    public void setRecurrent(String recurrent) {
        this.recurrent = recurrent;
    }


}
