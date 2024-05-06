package ch09_generic_collection.sec07;

import java.beans.beancontext.BeanContextMembershipListener;
import java.util.ArrayList;
import java.util.List;

public class Product {
 private int prdNo;
 private String prdName;
 private int prdPrice;
public Product(int prdNo, String prdName, int prdPrice) {
	super();
	this.prdNo = prdNo;
	this.prdName = prdName;
	this.prdPrice = prdPrice;
}
@Override
public String toString() {
	return "상품 번호: " + prdNo + "\n상품명=" + prdName + "\n상품가격:" + prdPrice + "]";
}
 

}
