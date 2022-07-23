package dataAccess.concretes;

import dataAccess.abstracts.DataRepository;
import entities.Player;

import java.util.List;

public class PlayerRepository implements DataRepository<Player> {
    @Override
    public List<Player> getAll() {
        return null;
    }

    @Override
    public void add(Player entity) {
        System.out.println("player added");
    }

    @Override
    public void update(Player entity) {

    }

    @Override
    public void delete(Player entity) {

    }
}
