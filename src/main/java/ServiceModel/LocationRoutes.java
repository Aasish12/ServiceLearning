package ServiceModel;

import Data.Location;

import ServiceInterface.LocationServices;

import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.List;


/*
* Location specific API route definitions.
* GOAL: Define routes, call services to return data.
*
* Josh Peyok
* */
@RestController
public class LocationRoutes {
    private LocationServices services = new LocationServices();

    /* Get routes */
    @RequestMapping(value = "/locations/all", method = RequestMethod.GET)
    public List<Location> getAllLocations() throws SQLException {
        return services.getAllLocations();
    }

    /* Search for locations by location fields */
    @RequestMapping(value = "/locations/search/{searchText}", method = RequestMethod.GET)
    public List<Location> searchLocations(@PathVariable("searchText") String searchText) throws SQLException {
        return services.searchLocations(searchText);
    }

    /* Search for locations by specified columns */
    @RequestMapping(value = "/locations/search/{searchColumn}/{searchText}", method = RequestMethod.GET)
    public List<Location> searchLocations(@PathVariable("searchColumn") String searchColumn, @PathVariable("searchText") String searchText) throws SQLException {
        return services.searchSpecificLocations(searchColumn, searchText);
    }

    @RequestMapping(value = "/locations/getById/{locationId}", method = RequestMethod.GET)
    public Location getLocationById(@PathVariable("locationId") int locationId) throws SQLException {
        return services.getById(locationId);
    }

    @RequestMapping(value = "/locations/getNewLocation", method = RequestMethod.GET)
    public Location getNewLocation() {
        return new Location();
    }

    /* Post & Put */
    @RequestMapping(value = "locations/post", method = RequestMethod.POST)
    public void postNewLocation(Location location) throws SQLException {
        services.postLocation(location);
    }

    @RequestMapping(value = "/locations/put", method = RequestMethod.PUT)
    public void putLocation(Location location) throws SQLException {
        services.putLocation(location);
    }
}