public class main {
    public static void main(String[] args) {
        fan fan1 = new fan();
        fan1.setSpeed(3);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setOn_off(true);
        System.out.println("fan1: "+fan1.toStirng());
        fan fan2 = new fan();
        fan2.setSpeed(2);
        fan2.setRadius(5);
        fan2.setColor("blue");
        fan2.setOn_off(false);
        System.out.println("fan2: "+fan2.toStirng());
    }
}
