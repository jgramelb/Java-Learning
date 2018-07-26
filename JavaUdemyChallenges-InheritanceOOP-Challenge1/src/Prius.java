public class Prius extends Car{
  private int roadServiceMonths;

  
  public Prius(int roadServiceMonths){
    super("Prius", "small", 4, 5, 5, false, roadServiceMonths);
    this.roadServiceMonths = roadServiceMonths;
  }

  /*
  public Toyota(int year, String model, String VIN){
    this.model = model;
    this.VIN = VIN; 
    System.out.println(year + " Toyota " + model + " VIN: " + VIN);
  }*/

  public void accelerate(int rate){
    int newSpeed = getCurrentSpeed() + rate;
    if (newSpeed == 0){
      stop();
      changeGear(1);
    }
    else if (newSpeed > 0 && newSpeed <= 10){
      changeGear(1);
    }
    else if (newSpeed > 10 && newSpeed <= 20){
      changeGear(2);
    }
    else if (newSpeed > 20 && newSpeed <= 30){
      changeGear(3);
    }
    else {
      changeGear(4);
    }

    if (newSpeed>0){
      changeSpeed(newSpeed, getCurrentDirection());
    }
  }

  /*
  @Override
  public void changeGear(int gearLevel){
    //If gear level not between 0 and 12, give error message;
    this.gearLevel = gearLevel;
    System.out.println("Gear Level: " + gearLevel);
  }
  @Override
  public void steer(int direction){
    this.direction = direction;
    System.out.println("Direction: " + direction + " degrees.");
  }
  //@Override
  public void move(int speed){
    this.speed = speed;
    System.out.println("Speed: " + speed);
  }*/

}