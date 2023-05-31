package multiple;
import entities.OrgEntity;
import themeInter.Cinema;

// This class is a child of OrgEntity and implements the Cinema interface

public class OrgCinema extends OrgEntity implements Cinema{
    
    public OrgCinema(String name, String category, int frequency, String theme, String orgaId, String canonical, String type, int members) {
        super(name, category, frequency, theme, orgaId, canonical, type, members);
    }

}