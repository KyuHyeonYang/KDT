package ch09_generic_collection.sec03;

public class Product<T,M> {
private T kindT;  //객체
private M modelM; //String
public T getKindT() {
	return kindT;
}
public void setKindT(T kindT) {
	this.kindT = kindT;
}
public M getModelM() {
	return modelM;
}
public void setModelM(M modelM) {
	this.modelM = modelM;
}
}
