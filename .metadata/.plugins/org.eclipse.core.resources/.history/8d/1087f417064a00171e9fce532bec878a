
public class Book{
	private String title, author, description;
	private int stock;
	private float price;
	public Book(){
		
	}
	public Book(String title, String author, String desc, int stock, float val){
		this.title = title;
		this.author = author;
		this.description = desc;
		this.stock = stock;
		this.price = val;
	}
	public String getTitle(){
		return title;
	}
	public void setTitle(String title){
		this.title = title;
	}
	public String getauthor(){
		return author;
	}
	public void setAuthor(String author){
		this.author = author;
	}
	public String getDescription(){
		return description;
	}
	public void setDescription(String description){
		this.description = description;
	}
	public boolean isInStock(){
		if (stock > 0 )
			return true;
		else
			return false;
	}
	public void setStock(int x){
		stock = x;
	}
	public int getStock(){
		return stock;
	}
	public float getPrice(){
		return price;
	}
	public void setPrice(float val){
		price = val;
	}
	public void getDisplayText(){
		System.out.printf("Author: %s, Title: %s\nDescription:\n%s\n",author,title,description);
	}
	public float requestPricingOfBooks(int count){
		float value = 0f;
		if (stock < count){
			value = price * stock;
			System.out.printf("There are not enough books to fill the complete order, returning the price for the max of %s books instead\n", stock);
		}
		else{
			value = price * count;
		}
		return value;
	}
}
