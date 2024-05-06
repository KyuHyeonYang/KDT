package ch08_interface.sec07;

import java.util.ArrayList;

public class ProductDAO implements IProductDAO {

	@Override
	public void insertProduct(ProductDTO dto) {
		System.out.println("상품번호: "+dto.getPrdNo());
		System.out.println("상품명: "+dto.getPrdName());
		System.out.println( "제조회사:"+dto.getPrdMaker());
		System.out.println("가격: " +dto.getPrdPrice());
		System.out.println( "재고: "+dto.getPrdStock()) ;

	}

	@Override
	public ArrayList<ProductDTO> getAllProduct() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProductDTO detailProduct(String prdNo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteProduct(String prdNo) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateProduct(ProductDTO dto) {
		// TODO Auto-generated method stub

	}

	@Override
	public ProductDTO searchProduct(String prdName) {
		// TODO Auto-generated method stub
		return null;
	}

}
