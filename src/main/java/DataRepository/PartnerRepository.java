package DataRepository;

import java.sql.SQLException;
import java.util.List;

import Data.Partner;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;

/*
* Access database from here
* GOAL: Database function calls specifically for partners.
*
* Josh Peyok
* */

public class PartnerRepository extends RepositoryBase {
    private Dao<Partner, String> partnerDao;

    public PartnerRepository() throws SQLException {
        super();
        partnerDao = DaoManager.createDao(db, Partner.class);
    }

    public List<Partner> getAllPartners() throws SQLException {
        return partnerDao.queryForAll();
    }

    public Partner getPartnerById(int id) throws SQLException {
        return partnerDao.queryForId(Integer.toString(id));
    }

}

