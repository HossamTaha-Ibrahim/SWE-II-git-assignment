// Assume the Series equation is 1+(1/n)
public class MultiplicationSeries implements ISubscriber {

	@Override
	public void notifySubscriber(String input) {
		int limit=Integer.parseInt(input);
		float result=1;
		int i=1;
		float div;
		
		for(;i<limit;i++) {
			div=1/i;
			result*=(1+div);
		}
		System.out.println("The resultu of Series Product is : "+result);
	}

}
