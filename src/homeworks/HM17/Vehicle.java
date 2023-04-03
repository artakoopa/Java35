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

    public float fuelUsageWithPassenger (float fuel, float fuelUsage, int passengers){
        return fuelUsage + (fuelUsage * (passengers * 0.05f));


    }
    public float maxDistance(){

        return (fuel / fuelUsageWithPassenger(float fuel, float fuelUsage, int passengers)) * 100;
    }
}
