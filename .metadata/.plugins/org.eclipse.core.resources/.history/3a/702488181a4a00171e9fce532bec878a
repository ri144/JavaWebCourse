import java.util.ArrayList;


public class BookDatabase {
	private ArrayList<Pair> books = new ArrayList();
	public BookDatabase(){
		books.add(new Pair("Java1001",new Book("Head First Java", "Kathy Sierra and Bert Bates", "Easy to read Java workbook", 1, 47.5f)));
		books.add(new Pair("Java1002",new Book("Thinking in Java", "Bruce Eckel", "Details about Java under the hood", 1, 20f)));
		books.add(new Pair("Orcl1003",new Book("OCP: Oracle Certified Professional Java SE", "Jeanne Boyarsky", "Everything you need to know in one place", 1, 45f)));
		books.add(new Pair("Python1004",new Book("Automate the Boring Stuff with Python", "Al Sweigart", "Fun with Python", 1, 10.5f)));
		books.add(new Pair("Zombie1005",new Book("The Maker's Guide to the Zombie Apocalypse", "Simon Monk", "Defend Your Base with Simple Circuits, Arduino, and Rasberry Pi", 1, 16.5f)));
		books.add(new Pair("Rasp1006",new Book("Rasberry Pi Projects for the Evil Genius", "Donald Norris", "A dozen fiendishly fun projects for the Rasberry Pi!", 1, 14.75f)));
	}
	
	
	public Book findBookFromSKU(String SKU){
		for(Pair p: books){
			if (SKU.equals(p.getL())){
				return (Book) p.getR();
			}
		}
		return null;
	}
}
