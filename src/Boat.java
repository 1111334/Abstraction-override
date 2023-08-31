public class Boat extends Vehicle {
    private double maxKnotsSpeed;
    private int boatKilosWeight;

    public Boat(double maxSpeed, int weight) {
        super("Boat", 0);
        this.maxKnotsSpeed = maxSpeed;
        this.boatKilosWeight = weight;
    }

    @Override
    public void doVehicleSound() {
        System.out.println("Boat sound: Splash Splash!");
    }

    public String getBoatWeightAndSpeed() {
        return "Boat weight: " + boatKilosWeight + " kg\nMax Knots Speed: " + maxKnotsSpeed + " knots";
    }
}
