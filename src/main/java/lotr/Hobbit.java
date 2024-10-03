package lotr;

import lotr.kickstrategy.HobbitKick;

public class Hobbit extends Character {

    public Hobbit(){
         // setHp(3);
          super(3,0, new HobbitKick());
          //set P
    }
    @Override
    public void kick(Character c){
        toCry();
    } 
    public void toCry(){
        System.out.println("cry");
    }


}
