package theOrigin.common;

import java.io.Serializable;

public class Sale implements Serializable{

	private double price;
	private int quantity;
	private double totalPrice;
	private Date date;
	private Client client;
	private boolean depth;
	private String observations;
	
	public Sale(double price, int quantity, boolean depth) {
		this.price = price;
		this.quantity = quantity;
		this.date = new Date();
		this.totalPrice = price*quantity;
		this.depth = depth;
		this.observations = "";
		}
	
	public Sale(double price, int quantity, boolean depth, String observations) {
		this.price = price;
		this.quantity = quantity;
		this.date = new Date();
		this.totalPrice = price*quantity;
		this.depth = depth;
		this.observations = observations;
		}
	
	public void setClient (Client c) {
		this.client = c;
	}

	public double getTotalPrice () {
		return this.totalPrice;
	}
	
	@Override
	public String toString () {
		return "Nome: " + this.client.getNome() + "\n" +
			   "Preço: " + this.price + "€\n" +
			   "Quantidade: " + this.quantity + "g\n" +
			   "Ficou a Dever?: " + this.depth + "\n" +
			   "Observações: " + this.observations + "\n" + "\n" +
			   "Total: " + this.totalPrice;
	}
}
