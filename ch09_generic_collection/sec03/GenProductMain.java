package ch09_generic_collection.sec03;

public class GenProductMain {

	public static void main(String[] args) {
		// 멀티 타입 파라미터
		Product <Tv,String>prd1=new Product<Tv, String>();
		prd1.setKindT(new Tv());
		prd1.setModelM("스마트TV");
		String tvModel=prd1.getModelM();
		System.out.println(tvModel);
		
		Product<Car, String>prd2=new Product<Car, String>();
		prd2.setKindT(new Car());
		prd2.setModelM("디젤");
		String carModel=prd2.getModelM();
		System.out.println(carModel);
	}

}
