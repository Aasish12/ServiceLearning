package DataRepository;

import java.sql.SQLException;
import java.util.List;

import Data.Position;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.stmt.PreparedQuery;
import com.j256.ormlite.stmt.QueryBuilder;
import com.j256.ormlite.stmt.Where;

public class PositionRepository extends RepositoryBase {
    private Dao<Position, String> positionDao;

    public PositionRepository() throws SQLException {
        super();
        positionDao = DaoManager.createDao(db, Position.class);
    }

    public List<Position> GetAllPositions() throws SQLException {
        return positionDao.queryForAll();
    }

    public List<Position> SearchPositions(String searchColumn, String searchText) throws SQLException {
        QueryBuilder<Position, String> qb = positionDao.queryBuilder();
        Where<Position, String> where = qb.where();

        where.like(searchColumn, "%" + searchText + "%");

        PreparedQuery<Position> preparedQuery = qb.prepare();

        return positionDao.query(preparedQuery);
    }

    public Position GetPositionById(int id) throws SQLException {
        return positionDao.queryForId(Integer.toString(id));
    }

    public void Post(Position newPosition) throws SQLException {
        positionDao.create(newPosition);
    }

    public void Put(Position position) throws SQLException {
        positionDao.update(position);
    }
}
