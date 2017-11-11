package ServiceInterface;

import java.sql.SQLException;
import java.util.*;

import Data.Partner;
import DataRepository.PartnerRepository;
import ServiceModel.Types.*;

/*
* Logic for Partners
*
* Josh Peyok
* */


public class PartnerServices {

    //todo: should these methods create a new Partner Repository every time?
    public List<Partner> getAllPartners() throws SQLException {
        return new PartnerRepository().getAllPartners();
    }

    //todo: implement this method
    public List<PartnerType> SearchPartners(String searchText) {
        return null;
    }

    public Partner getById(int id) throws SQLException {
        return new PartnerRepository().getPartnerById(id);
    }

    //todo: implement this method
    //todo: return status, not void
    public void postPartner(PartnerType partner) {

    }

    //todo: implement this method
    //todo: return status, not void
    public void putPartner(PartnerType partner) {

    }

}
