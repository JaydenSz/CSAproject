public class Magikarp {
    private int healthPoints;
    private boolean isAlive;
    private String name;
    private int evolutionStones = 2;
      
    public Magikarp(){
        hp = 308760;
        name = "Magikarp";
        isAlive = true;
    }
  
    public int splash(){
        if (Math.random() < 0.4){
            System.out.println("Magikarp's attack was surprisingly effective! It did 0 damage!");
            return 0;
        else {
            System.out.println("Wow! It somehow injured itself!");
            healthPoints-=20000;
            }
        }
    }
    
    public void takeDamage(int damage){
        this.healthPoints-=damage;
        if (healthPoints<=0){
            healthPoints = 0;
            isAlive = false;
            System.out.println("Magikarp fainted!");
        }
        System.out.println(name + "'s HP is: " + healthPoints);
    }

    public boolean isAlive(){
        return isAlive;
    }

    public String getName(){
        return name;
    }

    public getHP(){
        return healthPoints;
    }
    
}

public class Mewtwo {
    private int healthPoints;
    boolean isAlive = True;
    private String name “Mewtwo”;
      
      
    public Mewtwo () {
        healthPoints = 800;
        name = “Mewto”;
    }
  }
  
