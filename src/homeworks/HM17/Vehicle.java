package homeworks.HM17;

 public class Vehicle {

    private float fuel;
    private float fuelUsage;
    private int passengers;

    public Vehicle (float fuel, float fuelUsage, int passengers){
        this.fuel = fuel;
        this.fuelUsage = fuelUsage;
        this.passengers = passengers;
    }

    public float maxDistance (float fuel, float fuelUsage, int passengers){
        float fuelUsageWithPassenger = fuelUsage + (fuelUsage * (passengers * 0.05f));
        return (fuel / fuelUsageWithPassenger) * 100;


    }
    public float maxDistance (){
        return maxDistance(this.fuel, this.fuelUsage, this.passengers);
    }
}
