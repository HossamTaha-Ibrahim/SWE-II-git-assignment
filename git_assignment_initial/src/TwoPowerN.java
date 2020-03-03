public class TwoPowerN  implements ISubscriber {
    @Override
    public void notifySubscriber(String input) {
        double power= Double.parseDouble(input);
        System.out.println("2 power "+power+" is: " + Math.pow(2,power));
    }


}
