package ch08_interface.sec07;

import java.util.ArrayList;



public interface IProductDAO {
	/*- 추상 메소드 선언
		- 상품 등록 : insertProduct()
		- 전체 상품 조회 : getAllProduct()
		- 상세 상품 조회 (1개 상품 조회) : detailProduct()
		- 상품 정보 삭제 : deleteProduct()
		- 상품 정보 수정 : updateProduct()
		- 상품 검색 : 상품명으로 검색 
			- searchProduct()
	*/
	public void insertProduct(ProductDTO dto);

	public ArrayList<ProductDTO >getAllProduct();

	public ProductDTO  detailProduct   (String prdNo);

	public void deleteProduct(String prdNo);

	public void updateProduct(ProductDTO dto);

	public ProductDTO searchProduct   (String prdName);
	//상품번호만 유일하고 동일한 상품명이 존재하는 경우
	//여러개의 상품 반환
	//public ArrayList<ProductDTO >searchProduct   (String prdName);

	//참고:반환형에따라 기본return값 확인하기 위해
	//ProudctDAO 
}
