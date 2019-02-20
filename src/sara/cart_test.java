package sara;

import static org.junit.Assert.*;

import org.junit.Test;

import shopping.Cart.product;
import shopping.Cart.shca;

public class cart_test {

	@Test
	public void testcase0() {
		shca obj= new shca();
		assertTrue(obj.getcount()==0);
	}
	@Test
	public void testcase1(){
		shca cart = new shca();
		product obj = new product("Java product",1,127);
		cart.addproduct(obj);
		assertTrue(cart.getcount()==1);
		assertTrue(cart.getprice()==127);
	}
	@Test
	public void testcase2(){
		shca cart = new shca();
		product obj = new product("Java product",1,127);
		product obj1=new product("Web Design book",1,100);
		cart.addproduct(obj);	
		cart.addproduct(obj1);
		assertTrue(cart.getcount()==2);
		assertTrue(cart.getprice()==227);
	}

}
