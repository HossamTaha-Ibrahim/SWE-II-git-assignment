import java.util.Scanner;

public class circleArea implements ISubscriber 
{
	@Override
    public void notifySubscriber(String input) 
    {
	double r = Double.parseDouble(input);
        double circleArea =  Math.PI * r * r;
        System.out.println(circleArea );
    }
}