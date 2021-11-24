package modelo;

import java.sql.Date;
import java.util.ArrayList;

public class Order {
	private int id;
	private Date date;
	private Client client;
	private ArrayList<Product> products;
	private ArrayList<Service> services;
	private User worker;
	public Order() {
		
	}
	public Order(Date date, Client client, ArrayList<Product> products, ArrayList<Service> services) {
		this.date = date;
		this.client = client;
		this.products = products;
		this.services = services;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public ArrayList<Product> getProducts() {
		return products;
	}
	public void setProducts(ArrayList<Product> products) {
		this.products = products;
	}
	public ArrayList<Service> getServices() {
		return services;
	}
	public void setServices(ArrayList<Service> services) {
		this.services = services;
	}
	
}	
