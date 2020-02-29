public class CircleCircumference implements ISubscriber {
    @Override
    public void notifySubscriber(String input) {
        double in = Double.parseDouble(input);
        System.out.println("Circle Circumference is  = " + (2*3.14*in));

    }
}
