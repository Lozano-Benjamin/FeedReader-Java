package multiple;
import entities.OrgEntity;
import themeInter.OthersP;

// This class is a child of OrgEntity and implements the OthersP interface

public class OrgOthersP extends OrgEntity implements OthersP{
    
    public OrgOthersP(String name, String category, int frequency, String theme, String orgaId, String canonical, String type, int members) {
        super(name, category, frequency, theme, orgaId, canonical, type, members);
    }

}