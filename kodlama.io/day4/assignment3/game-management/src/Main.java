import business.concretes.GameManager;
import business.concretes.PlayerManager;
import business.concretes.SalesManager;
import core.utilities.Adapter;
import core.utilities.MernisService;
import dataAccess.concretes.GameRepository;
import dataAccess.concretes.PlayerRepository;
import entities.Campaign;
import entities.Game;
import entities.Player;

import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        GameManager gameManager=new GameManager(new GameRepository());
        MernisService mernisService=new Adapter();
        Player player=new Player(1,"rabia","çakır",
                "11111111111", LocalDate.parse("1998-01-13"));
        Game game=new Game(1,1000,"gta");
        Campaign campaign=new Campaign(1,"kış indirimi",0.40);
        PlayerManager playerManager=new PlayerManager(new PlayerRepository(),new Adapter());
        SalesManager salesManager=new SalesManager();
        salesManager.sale(game,campaign,player);
        playerManager.add(player);
        gameManager.add(game);
       for(Game game2:gameManager.getAllGames())
       {
           System.out.println(game2.getName()+" "+game2.getPrice());
       }

    }
}
