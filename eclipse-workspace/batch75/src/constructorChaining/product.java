package constructorChaining;

public class product {

	String productName;
	int price;
	int quantity;
	int totalCost;
	
	product(){
		this("Laptop");
	}
	product(String productName){
		this(productName,55000);
	}
	product(String productName,int price){
		this(productName,price,2);
	}
	product(String productName,int price,int quantity){
		this.productName=productName;
		this.price=price;
		this.quantity=quantity;
		
	}
	
	void display() {
		int totalCost=price*quantity;																																																																																																																																																																
		System.out.println("product Name:"+productName);
		System.out.println("product price:"+price);
		System.out.println("product Quantity:"+quantity);
		System.out.println("total cost:"+totalCost);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		product p = new product();
		p.display();
	}

}
