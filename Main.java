public class Magikarp {
  private int healthPoints;
  private boolean isAlive = True;
	private String name = “Magikarp”;
	private int evolutionStones = 2;
	
  public Magikarp(){
    hp = 308760;
    name = "Magikarp";
    isAlive = true;
  }

  public int splash(){
    if (Math.random() < 0.4){
		  System.out.println(“Magikarp’s attack was surprisingly effective! It did 0 damage!”);
      return 0;
    else {
		  System.out.println(“Wow! It somehow injured itself!”);
		  healthPoints-=20000;
    }
  }
}

public class Mewtwo {
	private int healthPoints;
	boolean isAlive = True;
	private String name “Mewtwo”;
	
	
public Mewtwo () {
		healthPoints = 800;
		Name = “Mewto”;
  }
}



