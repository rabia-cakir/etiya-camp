package core.utilities;

import entities.Player;

public class Adapter implements MernisService{
    @Override
    public boolean isUserValid(Player player) {
        System.out.println(player.getFirstName()+" "
                +player.getLastName()+" "+player.getIdentityNumber()+" "
                +player.getBirthDate().getYear()+" mernis'ten doğrulama yapıldı");

        return true;
    }
}
