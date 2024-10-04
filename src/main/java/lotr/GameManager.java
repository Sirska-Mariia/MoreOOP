package lotr;

public class GameManager {
    public void fight(Character c1, Character c2) {
        System.out.println("Fight starts between two characters.");
    
        while(c1.isAlive() && c2.isAlive()) {
            System.out.println("Character 1 attacks Character 2");
            c1.kick(c2);
    
            if(!c2.isAlive()) {
                System.out.println("Character 2 has been defeated!");
                break;
            }
            System.out.println("Character 2 attacks Character 1");
            c2.kick(c1);
    
            if(!c1.isAlive()) {
                System.out.println("Character 1 has been defeated!");
                break;
            }
        }
    
        System.out.println("The fight is over.");
    }
} 
