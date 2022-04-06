package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import enums.OrderStatus;

public class Order {
	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	public static final Calendar cal = new Calendar() {
		
		@Override
		public void roll(int field, boolean up) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public int getMinimum(int field) {
			// TODO Auto-generated method stub
			return 0;
		}
		
		@Override
		public int getMaximum(int field) {
			// TODO Auto-generated method stub
			return 0;
		}
		
		@Override
		public int getLeastMaximum(int field) {
			// TODO Auto-generated method stub
			return 0;
		}
		
		@Override
		public int getGreatestMinimum(int field) {
			// TODO Auto-generated method stub
			return 0;
		}
		
		@Override
		protected void computeTime() {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		protected void computeFields() {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void add(int field, int amount) {
			// TODO Auto-generated method stub
			
		}
	};
	
	private Date moment;
	private OrderStatus status;
	private Client client;
	ArrayList<OrderItem> items = new ArrayList<>();
	

	public Order() {

	}
	
	
	
	public Order(Date moment, OrderStatus status, Client client) {
		this.moment = moment;
		this.status = status;
		this.client = client;
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



	public void setMoment() {
		this.moment = Calendar.getInstance().getTime();
	}



	public OrderStatus getStatus() {
		return status;
	}



	public void setStatus(OrderStatus status) {
		this.status = status;
	}



	public Client getClient() {
		return client;
	}



	public void setClient(Client client) {
		this.client = client;
	}



	@Override
	public String toString() {
		return "Order [moment=" + moment + ", status=" + status + "]";
	}
	
	

}
