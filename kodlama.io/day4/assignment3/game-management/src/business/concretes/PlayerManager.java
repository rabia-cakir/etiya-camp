package business.concretes;

import business.abstracts.PlayerService;
import core.utilities.MernisService;
import dataAccess.abstracts.DataRepository;
import entities.Player;

import java.util.List;

public class PlayerManager implements PlayerService {

    private DataRepository dataRepository;
    private MernisService mernisService;

    public PlayerManager(DataRepository dataRepository, MernisService mernisService)
    {
        this.dataRepository=dataRepository;
        this.mernisService=mernisService;
    }

    @Override
    public List<Player> getAllPlayers() {
        return dataRepository.getAll();
    }

    @Override
    public void add(Player player) {
        if (mernisService.isUserValid(player))
            dataRepository.add(player);

    }

    @Override
    public void delete(Player player) {
        dataRepository.delete(player);
    }

    @Override
    public void update(Player player) {
        dataRepository.update(player);
    }
}
