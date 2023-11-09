public class Truck extends Vehicle{
    private int weight;

    @Override
    public void drive(double speed){
        System.out.println("We are driving" + this.toString())
    }

}
