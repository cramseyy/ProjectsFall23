package lab3;

public class Product {

	//class fields 
		//we will do data hiding. so all will start with private keywords
		private String prodName;
		private double prodPrice;
		private int prodQty;
		
		public Product(String prodName, double prodPrice) {//constructor
			this.prodName = prodName;
			this.prodPrice = prodPrice;
		}
		public Product() { //no args constructor
			// TODO Auto-generated constructor stub
		}
		public static void main(String[] args) {
			Product p1 = new Product();
			p1.setProdPrice(-20);
			System.out.println(p1.getProdPrice());
		}
		/**
		 * @return the prodName
		 */
		public String getProdName() {
			return prodName;
		}
		/**
		 * @param prodName the prodName to set
		 */
		public void setProdName(String prodName) {
			this.prodName = prodName;
		}
		/**
		 * @return the prodPrice
		 */
		public double getProdPrice() {
			return prodPrice;
		}
		/**
		 * @param prodPrice the prodPrice to set
		 */
		public void setProdPrice(double prodPrice) {//two variables with the exact same name
			if(prodPrice < 0) {
				this.prodPrice = 0.25;
			} else {
				this.prodPrice = prodPrice;
			}
		}
		/**
		 * @return the prodQty
		 */
		public int getProdQty() {
			return prodQty;
		}
		/**
		 * @param prodQty the prodQty to set
		 */
		public void setProdQty(int prodQty) {
			this.prodQty = prodQty;
		}
		
		public String toString() {
			return this.getProdName()+","+this.getProdPrice();
		}
	}


