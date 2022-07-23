package business.concretes;

import business.abstracts.GameService;
import core.utilities.MernisService;
import dataAccess.abstracts.DataRepository;
import entities.Campaign;
import entities.Game;

import java.util.List;

public class GameManager implements GameService {
    private DataRepository dataRepository;

    public GameManager(DataRepository dataRepository)
    {
        this.dataRepository=dataRepository;
    }


    @Override
    public List<Game> getAllGames() {
        return dataRepository.getAll();
    }

    @Override
    public void add(Game game) {
        dataRepository.add(game);
    }

    @Override
    public void delete(Game game) {
        dataRepository.delete(game);
    }

    @Override
    public void update(Game game) {
        dataRepository.update(game);
    }
}
