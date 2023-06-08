
public class Car {
    private String make; 
    private double distance; // km
    private double efficiency; // km/L 
    private double capacity; //liters (L)
    private double amount; // liters (L)

    public Car() {
    }
    
    public Car(String newMake, double newEfficieny, double newCapacity){
        make = newMake;
        distance = 0.0;
        efficiency = newEfficieny;
        capacity = newCapacity;
        amount = 0.0;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String newMake) {
        make = newMake;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double newDistance) {
        distance = newDistance;
    }

    public double getEfficiency() {
        return efficiency;
    }

    public void setEfficiency(double newEfficiency) {
        efficiency = newEfficiency;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double newCapacity) {
        capacity = newCapacity;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double newAmount) {
        amount = newAmount;
    }
    
    //adding fuel in the tank
    public void addFuel(double amount){
        double newAmount = getAmount() + amount;
        
        if (amount + getAmount() <= getCapacity()){
            setAmount(newAmount);
        } else {
            setAmount(getCapacity());
        }
    }
    
    // moving the car
    public void move(double distance){
        double totalDistance = distance + getDistance(); // km + km = km
        double newAmount = getAmount() - (distance / getEfficiency()); // L - (km/(km/L)) = L
        double newDistance = getDistance() + (getAmount()*getEfficiency()); // km + (L x (km/L) = km
        
        if (getAmount() >= distance / getEfficiency()){
            setDistance(totalDistance); // km
            setAmount(newAmount); // L
        } else {
            setDistance(newDistance); // km
            setAmount(0.0); // L
        }
    }
    
    @Override
    public String toString(){
       String output = "";
       output += getMake() + " has been driven " + getDistance() + " kilometers\n" +
               "It has a tank capacity of " + getCapacity() + " liters\n"+
               "It get " + getEfficiency() + " kilometers to the liter \n" + 
               "It has " + getAmount() + " liters in " + getMake() + "'s tank right now\n";
       
       return output;
    }
     
}
