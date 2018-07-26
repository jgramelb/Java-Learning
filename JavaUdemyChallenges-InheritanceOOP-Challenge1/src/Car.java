
public class Car extends Vehicle{
  private int wheels;// = 4;
  private int doors;
  private int gears;
  private boolean isManual;
  private int currentGear;
  
  //private int gearLevel;
  public Car(String name, String size, int wheels, int doors, int gears, boolean isManual, int currentGear){
    super(name,size);
    this.wheels = wheels;
    this.doors = doors;
    this.gears = gears;
    this.isManual = isManual;
    this.currentGear = 1;
  }

  public void changeGear(int currentGear) {
    this.currentGear = currentGear;
    System.out.println("Changed to " + this.currentGear + " gear.");
  }

  public void changeSpeed(int speed, int direction){
	move(speed, direction);
    System.out.println("Speed " + speed + ", direction " + direction);
  }
  
  

/*
  
  */

  /*@Override
  public void move(int speed){
    this.speed = speed;
    System.out.println("Speed: " + speed);
  }
  
  public void changeGear(int gearLevel){
    System.out.println("Gear Level: " + gearLevel);
  }

  public void steer(int direction){
    this.currentDirection = direction;
    System.out.println("Pointing in " + currentDirection + " degrees");
    */

}