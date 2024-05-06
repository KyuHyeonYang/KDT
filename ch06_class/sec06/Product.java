package ch06_class.sec06;

public class Product {
	
	private String prdName;
	private int prdPrice;
	private int prdStock;
	private int prdSold;
	
	public void inputProduct() {
		System.out.println("***상품 정보 입력***");
		System.out.println("상품명: " );
		 System.out.println("가격: ");
		 System.out.println("판매 수량: " );
		 System.out.println("재고 수량:");

	}
	public void showProduct() {
		System.out.println("***상품 정보 입력***");
		System.out.println("상품명: "+prdName );
		 System.out.println("가격: "+prdPrice);
		 System.out.println("판매 수량: "+prdSold );
		 System.out.println("재고 수량:"+prdStock);
	}
	public void showSalesAmount() {
		System.out.println("매출액: " +prdPrice*prdSold);
	}
	public void showStockAmount() {
		System.out.println("재고액:" +prdPrice*prdStock);
	}
}
