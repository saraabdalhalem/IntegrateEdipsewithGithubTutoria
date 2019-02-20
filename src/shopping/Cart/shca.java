package shopping.Cart;

import java.util.ArrayList;
import java.util.List;

public class shca {
	private int price;
	List<product>products=new ArrayList<>();
	public int getcount() {
		// TODO Auto-generated method stub
		return products.size();
	}

	public void addproduct(product obj) {
		products.add(obj)	;
	}
public int getprice(){
	if (products.size() > 0) {
		for (product product : products) {
			price+=product.getprice();
		}
	}
	return price;
}
}
