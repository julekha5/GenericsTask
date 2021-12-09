package generictest;

import org.junit.Assert;
import org.junit.Test;

public class MaxTestInGenericTesting {

	@Test
	public void findMaxIntegerPass() {
		int result = (Integer) MaxTestInGeneric.findMax(45, 46, 67);
		Assert.assertEquals(67, result);
	}

	@Test
	public void findMaxIntegerFail() {
		int result = (Integer) MaxTestInGeneric.findMax(45, 46, 67);
		Assert.assertEquals(46, result);
	}

	@Test
	public void findMaxFloatPass() {
		float result = (float) MaxTestInGeneric.findMax(45.6f, 46.7f, 67.0f);
		Assert.assertEquals(67.0f,67.0f,result);
	}

	@Test
	public void findMaxFloatFail() {
		float result = (float) MaxTestInGeneric.findMax(45.0f, 46.0f, 67.0f);
		Assert.assertNotEquals(42.0f,41.0f,result);
	}

	@Test
	public void findMaxStringPass() {
		String result = MaxTestInGeneric.findMax("Apple", "Banana", "Peach");
		Assert.assertEquals("Peach", result);
	}

	@Test
	public void findMaxStringFail() {
		String result = (String) MaxTestInGeneric.findMax("Apple", "Banana", "Peach");
		Assert.assertEquals("Apple", result);
	}

}
