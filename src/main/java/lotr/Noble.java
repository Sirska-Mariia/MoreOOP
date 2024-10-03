package lotr;
import lotr.kickstrategy.NobleKick;


import java.util.Random;
public abstract class Noble extends Character {
    public Noble(int min, int max){
       // int a = new Random().nextInt(min,max);
        super(new Random().nextInt(min,max), new Random().nextInt(min, max), new NobleKick());
    }

    @Override
    public void kick(Character c){
        c.setHp(c.getHp() - new Random().nextInt(getPower()));
    }
    

}
