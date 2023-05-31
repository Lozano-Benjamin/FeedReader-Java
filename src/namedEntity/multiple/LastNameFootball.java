package multiple;
import entities.LastNameEntity;
import themeInter.Football;

// This class is a child of LastNameEntity and implements the Football interface
public class LastNameFootball extends LastNameEntity implements Football{

    public LastNameFootball(String name, String category, int frequency, String theme, String PersonId, String origin, String canonical) {
        super(name, category, frequency, theme, PersonId, origin, canonical);
    }

}