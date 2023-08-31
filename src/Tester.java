public class Tester {
    public static void main(String[] args) {
        Car myCar = new Car(4, 4, 25000.0);
        Boat myBoat = new Boat(30.0, 5000);

        myCar.showVehicleDetails();
        myCar.doVehicleSound();

        System.out.println();

        myBoat.showVehicleDetails();
        myBoat.doVehicleSound();

        System.out.println("\n" + myBoat.getBoatWeightAndSpeed());
    }
}
