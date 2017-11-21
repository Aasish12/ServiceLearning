package ServiceModel;

import Data.Partner;
import ServiceInterface.PartnerServices;

import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.List;


/*
* Partner specific API route definitions.
* GOAL: Define routes, call services to return data.
*
* Josh Peyok
* */

@RestController
public class PartnerRoutes {
    private PartnerServices services = new PartnerServices();

    //getters
    @RequestMapping(value = "/partners/all", method = RequestMethod.GET)
    public List<Partner> getAllPartners() throws SQLException {
        return services.getAllPartners();
    }

    @RequestMapping(value = "/partners/search/{searchText}", method = RequestMethod.GET)
    public List<Partner> searchPartners(@PathVariable("searchText") String searchText) throws SQLException {
        return services.searchPartners(searchText);
    }

    @RequestMapping(value = "/partners/getById/{partnerId}", method = RequestMethod.GET)
    public Partner getPartnerById(@PathVariable("partnerId") int partnerId) throws SQLException {
        return services.getById(partnerId);
    }

    @RequestMapping(value = "/partners/getNewPartner", method = RequestMethod.GET)
    public Partner getNewPartner() {
        return new Partner();
    }

    //Post and Put
    @RequestMapping(value = "/partners/post", method = RequestMethod.POST)
    public void postPartner(@RequestBody Partner partner) throws SQLException {


        System.out.println("route" + partner.toString());
        services.postPartner(partner);
    }

    @RequestMapping(value = "/partners/put", method = RequestMethod.PUT)
    public void putPartner(Partner partner) throws SQLException {
        services.putPartner(partner);
    }

}

