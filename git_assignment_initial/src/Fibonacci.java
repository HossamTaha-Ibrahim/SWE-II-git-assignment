public class Fibonacci  implements ISubscriber {
    @Override
    public void notifySubscriber(String input) {
        int n = Integer.parseInt(input);
        double p = (1 + Math.sqrt(5)) / 2;
        long fib = Math.round(Math.pow(p, n) / Math.sqrt(5));
        
       
        System.out.println("The Febonacci is " + fib);
        
    }
}
