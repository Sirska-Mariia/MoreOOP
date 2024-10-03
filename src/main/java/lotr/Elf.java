package lotr;
//import lotr.kickstrategy.KickStrategy;
import lotr.kickstrategy.ElfKick;

//import lombok.AllArgsConstructor;
//import lotr.Character;
//


//import lombok.Getter;
//import lombok.Setter;
//
//@Getter
//@Setter
//
public class Elf extends lotr.Character {
    public Elf(){
        super(10,10, new ElfKick());
    
    }
  //  public Elf(int hp, int power) {
  //      super(hp, power);
  //  }

    public void kick (Character c){
        if (c.getPower() < getPower()){
            c.setHp(0);
        }
        else {
            setPower(getPower() - 1);
        }
        
    
    

    }

}
