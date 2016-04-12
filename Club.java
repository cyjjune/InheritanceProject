public class Club{
  
  private String room;
  private String teacher;
  private int time;
  private int duration;
  
  public Club( String room, String teacher, int time, int duration ){
    this.room = room;
    this.teacher = teacher;
    this.time = time;
    this.duration = duration;
  }
  
  public String getRoom(){return this.room;}
  public String getTeacher(){return this.teacher;}
  public int getTime(){return this.time;}
  public int getDuration(){return this.duration;}
  
  public void intro(){
    System.out.println("The club starts at "+this.getTime()+". At "+this.getRoom()+". Come and get CAS HOURS!!!");
 

}

}
