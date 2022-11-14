public class BaggageCar extends Car{
	BaggageCar() {
        passengers = 0; 
        comfortLevel = 0;
    }

	BaggageCar(int baggage) {
        super(0, 0, baggage);
    }
}
