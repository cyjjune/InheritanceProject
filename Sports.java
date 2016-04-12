public class Sports extends Clubs{
  
  public enum Balls{Basketball, Volleyball, Tennis, Squash, Football};
  private Balls ball;
  
  public Sports( String room, String teacher, int time, int duration, Balls ball){
    super( room,teacher,time,duration );
    this.ball = ball;
  }
  
  public Balls getBall(){return this.ball;} 
  
  public void intro(){
    System.out.println( "The "+this.getBall()+" Club is in the "+this.getRoom()+", starts at "+this.getTime()+".");

}

}
