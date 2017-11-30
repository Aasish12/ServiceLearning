package ServiceModel;

import Data.Position;
import ServiceInterface.PositionServices;

import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.List;

@RestController
public class PositionRoutes {
    private PositionServices services = new PositionServices();

    @RequestMapping(value = "/positions/all", method = RequestMethod.GET)
    public List<Position> getAllPositions() throws SQLException {
        return services.getAllPositions();
    }

    @RequestMapping(value = "/positions/search/{searchColumn}/{searchText}", method = RequestMethod.GET)
    public List<Position> searchPositions(@PathVariable("searchColumn") String searchColumn, @PathVariable("searchText") String searchText) throws SQLException {
        return services.SearchPositions(searchColumn, searchText);
    }

    @RequestMapping(value = "/positions/getById/{positionId}", method = RequestMethod.GET)
    public Position getPositionById(@PathVariable("positionId") int positionId) throws SQLException {
        return services.GetById(positionId);
    }

    @RequestMapping(value = "/positions/getNewPosition", method = RequestMethod.GET)
    public Position getNewPosition() {
        return new Position();
    }

    @RequestMapping(value = "/positions/post", method = RequestMethod.POST)
    public void postNewPosition(@RequestBody Position position) throws SQLException {
        services.PostPosition(position);
    }

    @RequestMapping(value = "/positions/put", method = RequestMethod.PUT)
    public void putPosition(@RequestBody Position position) throws SQLException {
        services.PutPosition(position);
    }
}
