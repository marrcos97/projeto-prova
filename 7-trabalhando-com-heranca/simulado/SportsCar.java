//import java.io.*;
class Car{
   public int gearRatio = 8;
   public String accelerate(long l){  return "Accelerate : Car";  }
}
class SportsCar extends Car{
   public int gearRatio = 9;
   public String accelerate(long l) throws NullPointerException {  return  "Accelerate : SportsCar";  }
   public static void main(String[] args) /*throws IOException*/ {
      Car c = new SportsCar();
	  Car car = new Car();
	  SportsCar sc = new SportsCar();
      System.out.println( c.gearRatio+"    "+c.accelerate(0) );
	  System.out.println( car.gearRatio+"  "+ car.accelerate(0) );
	  System.out.println( sc.gearRatio+"   "+ sc.accelerate(0) );
   }
}