package dataAccess.concretes;

import dataAccess.abstracts.DataRepository;
import entities.Game;
import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;
import java.util.List;

public class GameRepository implements DataRepository<Game> {
    List<Game> games=new ArrayList<>();
    @Override
    public List<Game> getAll() {

        return games;
    }

    @Override
    public void add(Game entity) {
        games.add(entity);
        System.out.println("game added successfully");
    }

    @Override
    public void update(Game entity) {
        System.out.println("game updated successfully");
    }

    @Override
    public void delete(Game entity) {
        games.remove(entity);
        System.out.println("game deleted successfully");

    }
}
