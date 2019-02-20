package shopping.Cart;

public class product {
	private String name;
	private int count ;
	private int price ;
	public product(String names, int i, int j) {
		name= names; count=i; price=j;
	}
public String  getname(){
	return name;
}
public int getnum(){
	return count;
}
public int getprice(){
	return price;
}
public void setname(String nn){
	name=nn;
} 
public void setcount(int counter){
	count=counter;
}
public void setprice(int pricee){
	price=pricee;
}
}
