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

    public List<Partner> searchPartners(String searchText) throws SQLException {
        return new PartnerRepository().searchPartners(searchText);

    }

    public Partner getById(int id) throws SQLException {
        return new PartnerRepository().getPartnerById(id);
    }

    //todo: return status, not void
    public void postPartner(Partner partner) throws SQLException {
         new PartnerRepository().post(partner);
    }

    //todo: return status, not void
    public void putPartner(Partner partner) throws SQLException {
        new PartnerRepository().put(partner);
    }

}
