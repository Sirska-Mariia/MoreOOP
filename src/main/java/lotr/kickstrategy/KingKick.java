package lotr.kickstrategy;

import java.util.Random;

import lotr.Character;
//import lotr.Noble;

public class KingKick implements KickStrategy{


    @Override
    public void kick(Character whoKick, Character whoIsKicked){
        int a = whoKick.getPower();

        whoIsKicked.setHp(whoIsKicked.getHp() - new Random().nextInt(a));
      //  c.setHp(c.getHp() - new Random().nextInt(getPower()));
    }

}
