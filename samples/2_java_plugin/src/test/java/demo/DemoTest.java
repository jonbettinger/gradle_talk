package demo;

import org.junit.Test;
import static org.junit.Assert.*;

public class DemoTest {

	@Test
	public void saysHello() {
		Demo demo = new Demo();
		assertEquals("Hello World!", demo.sayHello());
	}
}
