package DataRepository;

import Data.Location;
import Data.User;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.stmt.PreparedQuery;
import com.j256.ormlite.stmt.QueryBuilder;
import com.j256.ormlite.stmt.Where;

import java.sql.SQLException;
import java.util.List;

/*
*
* Access database from here
* GOAL: Database function calls specifically for locations.
*
* Josh Peyok
*
* 	ID int not null auto_increment
    ,City varchar(30) not null
    ,State varchar(30) not null
    ,AddressLine1 varchar(100) not null
    ,AddressLine2 varchar(100) not null
    ,Country varchar(30) not null
    ,Zipcode varchar(20) not null
    ,isPrimary boolean
* */

public class LocationRepository extends RepositoryBase {
    private Dao<Location, String> locationDao;

    public LocationRepository() throws SQLException {
        super();
        locationDao = DaoManager.createDao(db, Location.class);
    }

    public List<Location> getAllLocations() throws SQLException {
        return locationDao.queryForAll();
    }

    public List<Location> searchLocations(String searchText) throws SQLException {
        QueryBuilder<Location, String> qb = locationDao.queryBuilder();
        Where<Location, String> where = qb.where();

        where.like("City", '%' + searchText + '%')
                .or()
                .like("State", '%' + searchText + '%')
                .or()
                .like("AddressLine1", '%' + searchText + '%')
                .or()
                .like("AddressLine2", '%' + searchText + '%')
                .or()
                .like("Country", '%' + searchText + '%')
                .or()
                .like("Zipcode", '%' + searchText + '%');

        PreparedQuery<Location> preparedQuery = qb.prepare();

        return locationDao.query(preparedQuery);
    }

    public List<Location> searchSpecificLocations(String columnName, String searchText) throws SQLException {
        QueryBuilder<Location, String> qb = locationDao.queryBuilder();
        Where<Location, String> where = qb.where();

        where.like(columnName, '%' + searchText + '%');

        PreparedQuery<Location> preparedQuery = qb.prepare();

        return locationDao.query(preparedQuery);
    }



    public Location getLocationById(int id) throws SQLException {

        return locationDao.queryForId(Integer.toString(id));
    }

    public void post(Location newLocation) throws SQLException {
        locationDao.create(newLocation);
    }

    public void put(Location location) throws SQLException {
        locationDao.update(location);
    }

}

