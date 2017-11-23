package ServiceInterface;

import java.sql.SQLException;
import java.util.*;

import Data.Position;
import DataRepository.PositionRepository;

public class PositionServices {
    public List<Position> getAllPositions() throws SQLException {
        return new PositionRepository().GetAllPositions();
    }

    public List<Position> SearchPositions(String searchColumn, String searchText) throws SQLException {
        return new PositionRepository().SearchPositions(searchColumn, searchText);
    }

    public Position GetById(int id) throws SQLException {
        return new PositionRepository().GetPositionById(id);
    }

    public void PostPosition(Position newPosition) throws SQLException {
        new PositionRepository().Post(newPosition);
    }

    public void PutPosition(Position position) throws SQLException {
        new PositionRepository().Put(position);
    }
}
