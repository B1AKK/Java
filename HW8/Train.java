public class Train {
    int n = 0;
    final int MAX = 50;
    Car[] arr = new Car[MAX];
    
    public boolean addCar(Car car) {
        if (n >= MAX-1) return false;
        arr[n++] = car;
        return true;
    }

    public int countPassengers() {
        int count = 0;
        for (int i=0; i<n; i++) {
            count += arr[i].passengers;
        }
        return count;
    }

    public void sortByComfort() {
        if (n < 2) return;
        for (int i=n-2; i > -1; i--) {
            while (arr[i].comfortLevel > arr[i+1].comfortLevel) {
                Car tmp = arr[i].copy();
                arr[i] = arr[i+1].copy();
                arr[i+1] = tmp;
                if (i+2 >= n) continue;
                else i++;
            }
        }
    }

    public Train searchByPassangers(int a, int b) {
    	Train res = new Train();
        for (Car car: arr) {
        	if (car == null) {break;}
            if (car.passengers >= a && car.passengers <= b) {
            	res.addCar(car.copy());
            }
        }
        
        return res;
    }

    public void print() {
        for (int i=0; i<n; i++) {
            System.out.println("Car-"+(i+1)+": "+arr[i]);
        }
    }
}
