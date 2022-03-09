import java.util.*;

public class Retail {

	String name;
	ArrayList<Item>stock=new ArrayList<>();
	ArrayList<Item>sold=new ArrayList<>();
//a List containing Items available in the stock and another List containing sold  items.
	// view available stock, that prints Class name of item, name of Item,size of item and total number of items that have same name, and size
// Items are the same if their class name, item name and size are the same.

	
	public void addItem(Item item) {
		//loop through and check if there is any match if there is increment total by 1, otherwise add.
		stock.add(item);
	}
	public double totalSales() {
		double sum=0;
		for(Item item:stock) {
			sum+=item.getPrice();
		}
		return sum;
	}
	public void sell(String name,int size) {
		
	}
	public void viewStock() {
		//loop through stock
		
		//ClassName Item name Size Total
		//Drink coke 1 10;
		//Drink coke 2 5;
	}

}

