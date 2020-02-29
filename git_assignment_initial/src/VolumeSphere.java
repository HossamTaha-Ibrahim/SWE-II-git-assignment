public class SphereVoluum  implements ISubscriber {
    @Override
    public void notifySubscriber(String input) {
        double radius = Double.parseDouble(input);
        double volume = 4/3 * 3.14 * Math.pow(radius,3);
        System.out.println(volume);
    }
}
