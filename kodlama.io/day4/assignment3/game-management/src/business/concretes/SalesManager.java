package business.concretes;

import entities.Campaign;
import entities.Game;
import entities.Player;

public class SalesManager {

    public void sale(Game game, Campaign campaign, Player player)
    {
        game.setDiscountedPrice((1-campaign.getDiscountRate())*game.getPrice());
        System.out.println(player.getFirstName()+" "+player.getLastName()+" has bought "+game.getName());
        System.out.println(game.getPrice());
        System.out.println(game.getDiscountedPrice());
    }
}
