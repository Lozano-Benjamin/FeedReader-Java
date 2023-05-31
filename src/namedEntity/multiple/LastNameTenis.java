package multiple;
import entities.LastNameEntity;
import themeInter.Tenis;

// This class is a child of LastNameEntity and implements the Tenis interface
public class LastNameTenis extends LastNameEntity implements Tenis{

    public LastNameTenis(String name, String category, int frequency, String theme, String PersonId, String origin, String canonical) {
        super(name, category, frequency, theme, PersonId, origin, canonical);
    }

}