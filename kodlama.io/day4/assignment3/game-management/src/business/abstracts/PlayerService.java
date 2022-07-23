package business.abstracts;

import core.utilities.MernisService;
import entities.Campaign;
import entities.Game;
import entities.Player;

import java.util.List;

public interface PlayerService {
    List<Player> getAllPlayers();
    void add(Player player);
    void delete(Player player);
    void update(Player player);
}
