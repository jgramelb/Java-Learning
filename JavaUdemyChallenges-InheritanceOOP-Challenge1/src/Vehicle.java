public class Vehicle {
  private String name;
  private String size; 

  private int currentSpeed;
  private int currentDirection;
  //private String bodyStyle;

  public Vehicle(String name, String size){
    this.name = name;
    this.size = size;

    this.currentSpeed = 0;
    this.currentDirection = 0;
  }

  public void steer(int direction){
    this.currentDirection += direction;
    System.out.println("Pointing in " + currentDirection + " degrees");
  }

  public void move(int speed, int direction){
	currentSpeed = speed;
	currentDirection = direction;
    System.out.println("Vehicle moving at " + currentSpeed + " in direction " + currentDirection);
  }
  
  public void stop(){
	  this.currentSpeed = 0; 
  }

  public String getName(){
	    return name;
	  }
	  public String getSize(){
	    return size;
	  }
	  public int getCurrentSpeed(){
	    return currentSpeed;
	  }
	  public int getCurrentDirection(){
	    return currentDirection;
	  }
}


