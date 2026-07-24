package Constructors;

public class Product {
	int productId;
	String productName;
	int price;
	Product(int id,String name,int pric){
		productId=id;
		productName=name;
		price=pric;
		show();
		
	}
	void show() {
		System.out.println("product Id:"+productId);
		System.out.println("product Name:"+productName);
		System.out.println("product price:"+price);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p=new Product(10,"table",1000);
		System.out.println("------------------------");
		Product p1=new Product(20,"chair",500);
		System.out.println("-------------------------");
		Product p2=new Product(30,"bed",50000);
	 }

}
