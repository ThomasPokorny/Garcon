package garcon.app.model;

/**
*
* @author Thomas Pokorny
*
*/
public class Dish
{
	private int id;
	private String name;
	private String description;
	private String allergenes;
	private double price;
	private double discount;
	private String[] categories;

	public void setId(int id){
		this.id = id;
	}

	public void setName(String name){
		this.name = name;
	}

	public void setDescription(String description){
		this.description = description;
	}

	public void setAllergenes(String allergenes){
		this.allergenes = allergenes;
	}

	public void setPrice(double price){
		this.price = price;
	}

	public void setDiscount(double discount){
		this.discount = discount;
	}

	public void setCategories(String[] categories){
		this.categories = categories;
	}

	public int getId(){
		return id;
	}

	public String getName(){
		return name;
	}

	public String getDescription(){
		return description;
	}

	public String getAllergenes(){
		return allergenes;
	}

	public double getPrice(){
		return price;
	}

	public double getDiscount(){
		return discount;
	}

	public String[] getCategories(){
		return categories;
	}
}
