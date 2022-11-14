public class Car {
    int passengers, comfortLevel, baggage;

    public Car() {}

    public Car(int passengersNumber, int comfortLevel, int baggage) {
        this.passengers = passengersNumber;
        this.comfortLevel = comfortLevel;
        this.baggage = baggage;
    }

    public Car copy() {
        return new Car(passengers, comfortLevel, baggage);
    }

    @Override
    public String toString() {
        return "Number of passangers: " + passengers +
                "\nComfort level: " + comfortLevel +
                "\nBaggage: - " + baggage;
    }
}
