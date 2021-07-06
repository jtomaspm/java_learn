package theOrigin.common;

public class Product {

	private String nome;
	private double price;
	private int quantity;
	private double totalPrice;
	private String type;
	private int expectedQuantity;
	private Date date;
	
	public Product(String nome, double price, int quantity, String type) {
		this.nome = nome;
		this.price = price;
		this.quantity = quantity;
		this.type = type;
		this.totalPrice = price*quantity;
		this.expectedQuantity = quantity;
		this.date = new Date();
	}

}
