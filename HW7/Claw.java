public class Claw {
    double length = 10;
    int durability = 10;

    Claw(){}

    Claw(double length, int durability){
        this.length = length;
        this.durability = durability;
    }

    public void get(){
        System.out.println("/claw get/");
    }

    public void hide(){
        System.out.println("/claw hide/");
    }
}
