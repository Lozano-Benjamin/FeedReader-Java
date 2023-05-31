package multiple;
import entities.LastNameEntity;
import themeInter.Politics;

// This class is a child of LastNameEntity and implements the Politics interface

public class LastNamePolitics extends LastNameEntity implements Politics{
    
    public LastNamePolitics(String name, String category, int frequency, String theme, String PersonId, String origin, String canonical) {
        super(name, category, frequency, theme, PersonId, origin, canonical);
    }

}