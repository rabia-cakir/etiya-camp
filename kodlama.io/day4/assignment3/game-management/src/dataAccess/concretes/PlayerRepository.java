package dataAccess.concretes;

import dataAccess.abstracts.DataRepository;
import entities.Player;

import java.util.ArrayList;
import java.util.List;

public class PlayerRepository implements DataRepository<Player> {
    List<Player> players=new ArrayList<>();
    @Override
    public List<Player> getAll() {
        return players;
    }

    @Override
    public void add(Player entity) {
        players.add(entity);
        System.out.println("player added");
    }

    @Override
    public void update(Player entity) {
        System.out.println("player updated");

    }

    @Override
    public void delete(Player entity) {
        players.remove(entity);
        System.out.println("player deleted");

    }
}
