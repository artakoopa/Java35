package homeworks.HM17;

public class Car extends Vehicle {

    private boolean airConditioner;

    public Car(float fuel, float fuelUsage, int passengers, boolean airConditioner){
        super(fuel, fuelUsage, passengers);
        this.airConditioner = airConditioner;
    }

    public float maxDistance (float fuel, float fuelUsage, int passengers){
        float fuelUsageWithPassenger = fuelUsage + (fuelUsage * (passengers * 0.05f));
        if (airConditioner){
            fuelUsageWithPassenger *= 1.1f;
        }
        return (fuel / fuelUsageWithPassenger) * 100;
    }
}
