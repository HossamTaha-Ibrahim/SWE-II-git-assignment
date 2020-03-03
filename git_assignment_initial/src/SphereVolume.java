public class SphereVolume implements ISubscriber {
    @Override
    public void notifySubscriber(String input) {
        double radius = Double.parseDouble(input);
        double volume = (4/3) * Math.PI * Math.pow(radius,3);
        System.out.println(volume);
    }
}
