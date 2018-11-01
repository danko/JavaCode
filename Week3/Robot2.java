
public class Robot2 {
    private String name;
    private int joysticks;
    private int motors;

    public Robot2() {
        name = "Peanut";
        joysticks = 2;
        motors = 4;
    }

    public Robot2(String name, int joysticks, int motors) {
        this.name = name;
        this.joysticks = joysticks;
        this.motors = motors;
    }

    public String toString() {
        return "name: " + name + " joysticks " + joysticks + " motors " + motors;
    }

    public static void main(String[] args) {
        Robot2 r = new Robot2();
        System.out.println(r);

        Robot2 r2 = new Robot2("SpaceRaider", 1, 2);
        System.out.println(r2);
    }
};