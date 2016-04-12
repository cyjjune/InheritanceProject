public class BulletinBoard{
  
  public static void main(String[] args){
    Club Photography = new Club( "B303", "Ms.D", 1540, 60 );
    Photography.intro();
    
    Sports Basketball = new Sports( "Basketball Court", "Mr.O", 1540, 60, Sports.Balls.Basketball);
    Basketball.intro();
  }
  
  
}
