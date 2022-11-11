public class fan1 {
    public static void main(String[] args) {
        fan fan1 = new fan();
        fan1.setSpeed(3);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setOn_off(true);
        System.out.println("fan1: "+fan1.toStirng());
    }
}
