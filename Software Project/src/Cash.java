import java.awt.Component;
import java.awt.Rectangle;
import java.awt.event.PaintEvent;


public class Cash extends Payment{

	Cash(Service s) {
		super(s);
	}
	public void pay(double amount) {
		System.out.println("Transaction completed successfully\n\n");
	}

}
