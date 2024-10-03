package lotr;
import lotr.kickstrategy.KingKick;
import java.util.Random;

public class King extends Noble {
   // Random random = new Random();

    public King(){
       // super(hp, power);
     //   this.random = new Random();


      //  Random random = new Random();
      //  random.nextInt(3, 15); // Default constructor
//
      //  
      //  Random random2 = new Random();
      //  random2.nextInt(5, 15); // Default constructor

        super(new Random().nextInt(3, 15), new Random().nextInt(5, 15));

       // @Override
       // public void kick(Character c) {
       //     c.setUp(c.getHp() = new Random().nextInt(getPower()));
;      //  }
    }

}
