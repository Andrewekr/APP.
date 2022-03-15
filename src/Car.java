public class Car {
    public void start(){
        System.out.println("The engine is running");
    }
    public void stop(){
        System.out.println("The engine is shut off");
    }
    public int drive(int howLong){
    int distance=0;
    distance = howLong*60;
    System.out.println("The distance is" + distance + "complete");
        return distance;
    }
}
