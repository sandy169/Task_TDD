import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RemovalTest {

	//“ABCD” => “BCD”
    // “AACD” => “CD” 
    //“BACD” => “BCD”
    //“BBAA” => “BBAA”       
    //“AABAA” => “BAA”
	String str="";
	Removals r=new Removals();
	@Test
	void test1() {
		str=r.remove("AB");
		assertEquals(str,"B");
	}
	@Test
	void test2() {
		str=r.remove("AACD");
		assertEquals(str,"CD");
	}
	@Test
	void test3() {
		str=r.remove("BACD");
		assertEquals(str,"BCD");
	}
	@Test
	void test4() {
		str=r.remove("BBAA");
		assertEquals(str,"BBAA");
	}
	@Test
	void test5() {
		str=r.remove("AABAA");
		assertEquals(str,"BAA");
	}

}
