import java.util.Date;

public class Drink extends Item {
	private String typedrink;

	public Drink(double price, String name, int size, String expiryDate,String typedrink) {
		super(price, name, size, expiryDate);
		this.typedrink=typedrink;
	}

	

	public String getTypedrink() {
		return typedrink;
	}

	public void setTypedrink(String typedrink) {
		this.typedrink = typedrink;
	}
}
