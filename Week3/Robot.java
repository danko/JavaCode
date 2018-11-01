public class Robot {
    public String name;
    public int numberOfJoysticks;
    public int numberOfMotors;

    public static void main(String[] args) {
        Robot r = new Robot();
        r.name = "Peanut";
        r.numberOfJoysticks = 2;
        r.numberOfMotors = 4;

        System.out.print("name: " + r.name);
        System.out.print(" joysticks: " + r.numberOfJoysticks);
        System.out.println(" motors " + r.numberOfMotors);
    }
};