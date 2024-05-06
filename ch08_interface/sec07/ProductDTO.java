package ch08_interface.sec07;

public class ProductDTO {
	private String prdNo ;
	private String prdName;
	private String prdMaker;
	private String prdPrice;
	private String PrdStock;
	public ProductDTO(String prdNo, String prdName, String prdMaker, String prdPrice, String prdStock) {
		super();
		this.prdNo = prdNo;
		this.prdName = prdName;
		this.prdMaker = prdMaker;
		this.prdPrice = prdPrice;
		PrdStock = prdStock;
	}
	public String getPrdNo() {
		return prdNo;
	}
	public void setPrdNo(String prdNo) {
		this.prdNo = prdNo;
	}
	public String getPrdName() {
		return prdName;
	}
	public void setPrdName(String prdName) {
		this.prdName = prdName;
	}
	public String getPrdMaker() {
		return prdMaker;
	}
	public void setPrdMaker(String prdMaker) {
		this.prdMaker = prdMaker;
	}
	public String getPrdPrice() {
		return prdPrice;
	}
	public void setPrdPrice(String prdPrice) {
		this.prdPrice = prdPrice;
	}
	public String getPrdStock() {
		return PrdStock;
	}
	public void setPrdStock(String prdStock) {
		PrdStock = prdStock;
	}
	
	
	
	
}


