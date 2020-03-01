public class SphereArea implements ISubscriber {
    @Override
    public void notifySubscriber(String input) {
        double spherearea = 4 * Math.PI * Math.pow(Double.parseDouble(input), 2);
        System.out.println(spherearea);
    }
}