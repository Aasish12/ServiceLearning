package DataRepository;

import java.sql.SQLException;
import java.util.List;

import Data.Partner;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.stmt.PreparedQuery;
import com.j256.ormlite.stmt.QueryBuilder;
import com.j256.ormlite.stmt.Where;

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

    //todo: decide elastic searcd functionality
    public List<Partner> searchPartners(String searchText) throws SQLException {
        QueryBuilder<Partner, String> qb = partnerDao.queryBuilder();
        Where<Partner, String> where = qb.where();

        where.like("FirstName", '%'+searchText+'%')
                .or()
                .like("LastName", '%'+searchText+'%')
                .or()
                .like("Phone", '%'+searchText+'%')
                .or()
                .like("CompanyName", '%'+searchText+'%');

        PreparedQuery<Partner> preparedQuery = qb.prepare();

        return partnerDao.query(preparedQuery);
    }

    public void post(Partner newPartner) throws SQLException {
        System.out.println("repo" + newPartner.toString());
        partnerDao.create(newPartner);
    }

    public void put(Partner partner) throws SQLException {
        partnerDao.update(partner);
    }

}

