package theOrigin.common;

import java.io.Serializable;
import java.util.LinkedList;

public class Client implements Serializable{

	private String nome;
	private double totalSpent;
	private double depth;
	private LinkedList<Sale> sales;
	private double defaultPrice;
	
	
	public Client(String nome) {
		this.nome = nome.toUpperCase();
		this.totalSpent = 0;
		this.depth = 0;
		this.sales = new LinkedList<Sale>();
		this.defaultPrice = 7.5;
	}
	
	
	public void purchase(double price, int quantity, boolean depth) {
		Sale s = new Sale(price, quantity, depth);
		s.setClient(this);
		this.sales.add(s);
		this.defaultPrice = price;
		this.totalSpent += s.getTotalPrice();
		if(depth) {
			this.depth += s.getTotalPrice();
		}
	}
	
	public void purchase(double price, int quantity, boolean depth, double paid) {
		Sale s = new Sale(price, quantity, depth);
		s.setClient(this);
		this.sales.add(s);
		this.defaultPrice = price;
		this.totalSpent += s.getTotalPrice();
		if(depth) {
			this.depth += (s.getTotalPrice() - paid);
		}
	}
	
	public void payDepth (double d) {
		this.depth -= d;
	}
	
	public void addDepth (double d) {
		this.depth += d;
	}
	
	public double getDepth () {
		return this.depth;
	}
	
	public String getNome () {
		return this.nome;
	}

}
