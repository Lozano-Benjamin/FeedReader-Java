package entities;

public class ProductEntity extends NamedEntity {
    private String commercial;
    private String producer;

    public ProductEntity(String name, String category, int frequency, String theme, String commercial, String producer) {
        super(name, category, frequency, theme);
        this.commercial = commercial;
        this.producer = producer;
    }
    
    public String getCommercial() {
        return commercial;
    }

    public void setCommercial(String commercial) {
        this.commercial = commercial;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

}
