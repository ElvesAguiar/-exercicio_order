package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import enums.OrderStatus;

public class Program {
	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Scanner sc = new Scanner(System.in);

		// Variaveis uteis
		Product product = new Product();
		Order order = new Order();

		// instanciando Cliente
		System.out.println("Enter Cliente data:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Birth date (DD/MM/YYYY): ");
		Date date = sdf.parse(sc.nextLine());
		Client client = new Client(name, email, date);

		// instanciando Order
		System.out.println("Enter order data:");
		System.out.print("Status: ");

		OrderStatus status = OrderStatus.valueOf(sc.nextLine());

		System.out.print("How many items to this order? ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			// instanciando Item
			sc.nextLine();
			System.out.printf("Enter #%d item data: \n", i+1);
			System.out.print("Product name: ");
			String nameItem = sc.nextLine();
			System.out.print("Product price: ");
			double price = sc.nextDouble();
			product = new Product(nameItem, price);

			System.out.print("Quantity: ");
			int quantity = sc.nextInt();
			OrderItem item = new OrderItem(quantity, price, product);
			// adicionando valores a Order
			order.setClient(client);
			order.setStatus(status);
			order.setMoment();
			order.addItem(item);
		}

		System.out.println();
		System.out.println("ORDER SUMMARY: ");
		order.orderSumary();
		sc.close();
	}
}
