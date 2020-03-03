public class SummtionSeries implements ISubscriber {
    @Override
    public void notifySubscriber(String input) {
        int x = Integer.parseInt(input);
        int result = 0;
        for (int j = 0; j <= x; j++) {
            result += 1;

    }
        System.out.println( " Summtion Series is: " + result );
}
}