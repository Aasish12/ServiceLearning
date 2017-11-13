package ServiceModel;

import Data.Location;

import ServiceInterface.LocationServices;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.sql.SQLException;
import java.util.List;


/*
* Location specific API route definitions.
* GOAL: Define routes, call services to return data.
*
* Josh Peyok
* */
@Path("/locations")
public class LocationRoutes {
    private LocationServices services = new LocationServices();

    /* Get routes */
    @GET
    @Path("/all")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Location> getAllLocations() throws SQLException {
        return services.getAllLocations();
    }

    /* Search for locations by location fields */
    @GET
    @Path("/search/{searchText}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Location> searchLocations(@PathParam("searchText") String searchText) throws SQLException {
        return services.searchLocations(searchText);
    }

    /* Search for locations by specified columns */
    @GET
    @Path("/search/{searchColumn}/{searchText}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Location> searchLocations(@PathParam("searchColumn") String searchColumn, @PathParam("searchText") String searchText) throws SQLException {
        return services.searchSpecificLocations(searchColumn, searchText);
    }

    @GET
    @Path("/getById/{locationId}")
    @Produces(MediaType.APPLICATION_JSON)
    public Location getLocationById(@PathParam("locationId") int locationId) throws SQLException {
        return services.getById(locationId);
    }

    @GET
    @Path("/getNewLocation")
    @Produces(MediaType.APPLICATION_JSON)
    public Location getNewLocation() {
        return new Location();
    }

    /* Post & Put */
    @POST
    @Path("/post")
    @Consumes(MediaType.APPLICATION_JSON)
    public void postNewLocation(Location location) throws SQLException {
        services.postLocation(location);
    }

    @PUT
    @Path("/put")
    @Consumes(MediaType.APPLICATION_JSON)
    public void putLocation(Location location) throws SQLException {
        services.putLocation(location);
    }
}