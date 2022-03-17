public class JamesBondCar {
    public int drive(int howLong){
    int distance=0;
    distance = howLong*180;
    System.out.println("The distance is" + distance + "complete");
    return distance;
}
    public static void main(String [] args){
        Car myCar = new Car();
        myCar.start();
        myCar.drive(30);
    }


}
