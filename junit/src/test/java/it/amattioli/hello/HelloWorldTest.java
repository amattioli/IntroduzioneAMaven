package it.amattioli.hello;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class HelloWorldTest {
	
	@Test
	public void testPadding() {
		String result = HelloWorld.pad("MyString");
		assertEquals("######MyString######", result);
	}
	
}