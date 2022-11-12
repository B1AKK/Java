public class Tooth {
    double length = 10;
    int durability = 10;

    Tooth(){}

    Tooth(double length, int durability){
        this.length = length;
        this.durability = durability;
    }

    public void show(){
        System.out.print("|/");
    }
}
