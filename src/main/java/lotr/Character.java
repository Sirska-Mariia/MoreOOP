package lotr; 
import lotr.kickstrategy.KickStrategy;
import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;

@Getter @Setter @AllArgsConstructor
public abstract class Character{
    private int hp;
    private int power;
    private KickStrategy kickStrategy;

    //public abstract void KickCharacter;



    public abstract void kick(Character c);//{
      //  kickStrategy.kick(c, c);;
        
    //}
    public boolean isAlive(){
        return hp>0;
    }

    @Override
    public String toString(){
        return this.getClass().getClass().getSimpleName() + "{hp=" + hp + ", power = " + power + '}';
    }

}
