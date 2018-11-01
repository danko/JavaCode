
public class RobotArray {
    private String name;
    private int joysticks;
    private int motors;
    private String[] motorNames;

    public RobotArray() {
        this("Peanut", 2, 4);
    }

    public RobotArray(String name, int joysticks, int motors) {
        this.name = name;
        this.joysticks = joysticks;
        this.motors = motors;
        motorNames = new String[motors];
        for (int i = 0; i < motors; i++) {
            motorNames[i] = "Motor" + i;
        }
    }

    public String toString() {
        String output = "";

        output += "name: " + name + " joysticks " + joysticks + " motors " + motors;
        for (int i = 0; i < motors; i++) {
            output += motorNames[i] + " ";
        }
        return output;
    }

    public static void main(String[] args) {
        RobotArray r = new RobotArray();
        System.out.println(r);

        RobotArray r2 = new RobotArray("SpaceRaider", 1, 2);
        System.out.println(r2);
    }
};