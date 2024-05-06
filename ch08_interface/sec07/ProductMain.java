package ch08_interface.sec07;

public class ProductMain {

	public static void main(String[] args) {
		ProductDTO dto=new ProductDTO("1111", "연필","모나미" , "1000", "20");
		
		
		ProductDAO dao=new ProductDAO();
		dao.insertProduct(dto);

	}

}
