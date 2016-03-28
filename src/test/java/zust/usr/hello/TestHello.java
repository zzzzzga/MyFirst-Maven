package zust.usr.hello;

import org.junit.*;
import static org.junit.Assert.assertEquals;

public class TestHello {
	
	@Test
	public void testsayHello(){
			Hello h = new Hello();
			String s = h.sayHello("student");
			assertEquals(s, "hello, student");
	}
	
}