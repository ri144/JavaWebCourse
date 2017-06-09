import java.text.DecimalFormat;
import java.text.NumberFormat;

public class BookApp {
	public static void main(String[] args) {
		NumberFormat formatter = new DecimalFormat("#0.00");
		Book b = new Book("1984","George Orwell","Dystopian society where big brother is watching you", 5, 9.99f);
		b.getDisplayText();
		System.out.println(formatter.format(b.requestPricingOfBooks(3)));
		BookDatabase mydata = new BookDatabase();
		System.out.print(mydata.findBookFromSKU("Java1001").getPrice());
	}
}
