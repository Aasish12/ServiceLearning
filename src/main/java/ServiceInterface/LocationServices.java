package ServiceInterface;

import Data.Location;
import DataRepository.LocationRepository;

import java.sql.SQLException;
import java.util.List;

public class LocationServices {
    public List<Location> getAllLocations() throws SQLException {
        return new LocationRepository().getAllLocations();
    }

    public List<Location> searchLocations(String searchText) throws SQLException {
        return new LocationRepository().searchLocations(searchText);
    }

    public List<Location> searchSpecificLocations(String columnName, String searchText) throws SQLException {
        return new LocationRepository().searchSpecificLocations(columnName, searchText);
    }

    public Location getById(int locationId) throws SQLException {
        return new LocationRepository().getLocationById(locationId);
    }

    public void postLocation(Location newLocation) throws SQLException {
        new LocationRepository().post(newLocation);
    }

    public void putLocation(Location location) throws SQLException {
        new LocationRepository().put(location);
    }
}
