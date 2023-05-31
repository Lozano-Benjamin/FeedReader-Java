package entities;

public class OtherGenEntity extends NamedEntity {
    private String comments;

    public OtherGenEntity(String name, String category, int frequency, String theme, String comments) {
        super(name, category, frequency, theme);
        this.comments = comments;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
}
