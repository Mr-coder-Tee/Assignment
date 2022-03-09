import java.util.Date;

public class Detergent extends Item{
	private String form;
	public Detergent(double price, String name, int size, String expiryDate,String form) {
		super(price, name, size, expiryDate);
		this.form=form;
	}

	
}
