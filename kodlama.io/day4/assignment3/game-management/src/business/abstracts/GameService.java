package business.abstracts;

import core.utilities.MernisService;
import entities.Campaign;
import entities.Game;

import java.util.List;

public interface GameService {
    List<Game> getAllGames();
    void add(Game game);
    void delete(Game game);
    void update(Game game);
}
