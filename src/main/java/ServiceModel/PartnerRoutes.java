package ServiceModel;

import Data.Partner;
import ServiceModel.Types.PartnerType;
import ServiceInterface.PartnerServices;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.sql.SQLException;
import java.util.List;


/*
* Partner specific API route definitions.
* GOAL: Define routes, call services to return data.
*
* Josh Peyok
* */

@Path("/partners")
public class PartnerRoutes {
    private PartnerServices services = new PartnerServices();

    //getters
    @GET
    @Path("/all")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Partner> getAllPartners() throws SQLException {
        return services.getAllPartners();
    }

    @GET
    @Path("/search/{searchText}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Partner> searchPartners(@PathParam("searchText") String searchText) throws SQLException {
        return services.searchPartners(searchText);
    }

    @GET
    @Path("/getById/{partnerId}")
    @Produces(MediaType.APPLICATION_JSON)
    public Partner getPartnerById(@PathParam("partnerId") int partnerId) throws SQLException {
        return services.getById(partnerId);
    }

    @GET
    @Path("/getNewPartner")
    @Produces(MediaType.APPLICATION_JSON)
    public Partner getNewPartner() {
        return new Partner();
    }

    //Post and Put
    @POST
    @Path("/post")
    @Consumes(MediaType.APPLICATION_JSON)
    public void postPartner(Partner partner) throws SQLException {
        services.postPartner(partner);
    }

    @PUT
    @Path("/put")
    @Consumes(MediaType.APPLICATION_JSON)
    public void putPartner(Partner partner) throws SQLException {
        services.putPartner(partner);
    }

}

