import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Item implements ItemInterface{

	private double price;
	 String name;
	 int size;
	 Date expiryDate;
	
	public Item(double price,String name,int size,String expiryDate) {
		try {
			this.expiryDate=new SimpleDateFormat("dd/mm/yyyy").parse(expiryDate);
		} catch (ParseException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		this.size=size;
		this.name=name;
		this.price=price;
	}
	
	public int viewExpiry() {
		return 1;
	}
	
	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return price;
	}

	@Override
	public void setPrice(double price) {
		// TODO Auto-generated method stub
		this.price=price;
	}

}
