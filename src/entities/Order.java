package entities;

import java.util.ArrayList;
import java.util.Date;

import enums.OrderStatus;

public class Order {
	private Date moment;
	private OrderStatus status;
	
	ArrayList<OrderItem> items = new ArrayList<>();
	

	public Order() {

	}
	
	
	
	public Order(Date moment, OrderStatus status) {
		this.moment = moment;
		this.status = status;
	}



	public void addItem(OrderItem item) {
		items.add(item);
	}

	public void RemoveItem(OrderItem item) {
		items.remove(item);
	}



	public Date getMoment() {
		return moment;
	}



	public void setMoment(Date moment) {
		this.moment = moment;
	}



	public OrderStatus getStatus() {
		return status;
	}



	public void setStatus(OrderStatus status) {
		this.status = status;
	}



	@Override
	public String toString() {
		return "Order [moment=" + moment + ", status=" + status + "]";
	}
	
	

}
