package Lab3;

import java.util.Arrays;

import Lab3.Product.OrderItem;

public class Product {
	private String id;
	private String name;
	private double price;
	private String type;

	public String getId() {
		return id;
	}

	public String getType() {
		return type;
	}

	public double getPrice() {
		return price;
	}

	public class OrderItem {
		private Product p;
		private int quality;

		public OrderItem(Product p, int quality) {
			this.p = p;
			this.quality = quality;
		}

	}

	public class Order {
		private OrderItem[] items;

		public double cost() {
			double totalCost = 0.0;
			for (OrderItem item : items) {
				totalCost += item.p.getPrice() * item.quality;
			}
			return totalCost;
		}

		public boolean contains(Product p) {
			Arrays.sort(items, (a, b) -> a.p.getId().compareTo(b.p.getId()));
			int index = Arrays.binarySearch(items, new OrderItem(p, 0), (a, b) -> a.p.getId().compareTo(b.p.getId()));
			return index >= 0;
		}

		public Product[] filter(String type) {
			int count = 0;
			for (OrderItem item : items) {
				if (item.p.getType().equalsIgnoreCase(type)) {
					count++;
				}
			}
			Product[] filteredProducts = new Product[count];
			int index = 0;
			for (OrderItem item : items) {
				if (item.p.getType().equalsIgnoreCase(type)) {
					filteredProducts[index++] = item.p;
				}
			}
			return filteredProducts;
		}
	}
}
