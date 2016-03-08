package mainPackage;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TriangleTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetArea() {
		Triangle one = new Triangle(3.0, 4.0, 5.0);
		assertEquals(one.getArea(), 6.0, 0.0000001);
		Triangle two = new Triangle(6.0, 8.0, 10.0);
		assertEquals(two.getArea(), 24.0, 0.0000001);
	}

	@Test
	public void testGetPerimeter() {
		Triangle three = new Triangle(3.0, 5.0, 7.0);
		assertEquals(three.getPerimeter(), 15, 0.00000001);
		Triangle one = new Triangle(17.0, 28.0, 35.0);
		assertEquals(one.getPerimeter(), 80, 0.00000001);
		Triangle two = new Triangle(29.0, 29.0, 40.0);
		assertEquals(two.getPerimeter(), 98, 0.00000001);
	}
}
