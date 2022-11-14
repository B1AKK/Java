public class Predator {
    private Tooth[] teeth;
    private Claw[] claws;
    private int voice = 0;
    private String state;
    Predator(int teeth, int claws){
        this.teeth = new Tooth[teeth];
        this.claws = new Claw[claws];
        for (int i = 0; i < teeth; i++){
            this.teeth[i] = new Tooth();
        }
        for (int i = 0; i < claws; i++){
            this.claws[i] = new Claw();
        }
    }

    public void growl(){
        for (int i = 0; i < this.teeth.length; i++){
            this.teeth[i].show();
        }
        System.out.println();
        this.voice = 3;
    }

    public void run(){
        this.state = "run";
        System.out.println("/running/");
    }

    public void sleep(){
        this.state = "sleep";
        System.out.println("/sleeping/");
    }

    public void find_food(){
        this.state = "sniff";
        System.out.println("/sniffing/");
    }
}
