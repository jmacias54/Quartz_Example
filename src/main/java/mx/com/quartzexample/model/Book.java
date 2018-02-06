package mx.com.quartzexample.model;

public class Book {
	
	

    private String book ;
    private String minimum_price ;
    private String maximum_price ;
    private String minimum_amount ;
    private String maximum_amount ;
    private String minimum_value ;
    private String maximum_value ;
    
    
    
    
    
    
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getBook() {
		return book;
	}
	public void setBook(String book) {
		this.book = book;
	}
	public String getMinimum_price() {
		return minimum_price;
	}
	public void setMinimum_price(String minimum_price) {
		this.minimum_price = minimum_price;
	}
	public String getMaximum_price() {
		return maximum_price;
	}
	public void setMaximum_price(String maximum_price) {
		this.maximum_price = maximum_price;
	}
	public String getMinimum_amount() {
		return minimum_amount;
	}
	public void setMinimum_amount(String minimum_amount) {
		this.minimum_amount = minimum_amount;
	}
	public String getMaximum_amount() {
		return maximum_amount;
	}
	public void setMaximum_amount(String maximum_amount) {
		this.maximum_amount = maximum_amount;
	}
	public String getMinimum_value() {
		return minimum_value;
	}
	public void setMinimum_value(String minimum_value) {
		this.minimum_value = minimum_value;
	}
	public String getMaximum_value() {
		return maximum_value;
	}
	public void setMaximum_value(String maximum_value) {
		this.maximum_value = maximum_value;
	}
	@Override
	public String toString() {
		return "Book [book=" + book + ", minimum_price=" + minimum_price + ", maximum_price=" + maximum_price
				+ ", minimum_amount=" + minimum_amount + ", maximum_amount=" + maximum_amount + ", minimum_value="
				+ minimum_value + ", maximum_value=" + maximum_value + "]";
	}
    
    
    

}
