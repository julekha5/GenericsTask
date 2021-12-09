package generictest;

import org.junit.Assert;
import org.junit.Test;

public class MaximumTest {

	@Test
	// Test Case for the Integer where max_Value at First Position
	public void given3IntegerValue_WhenGetMaximumNO_ShouldReturnCorrectMaxValue() {
		Maximum maximum = new Maximum();
		int actualResult = Maximum.findMax(16, 15, 10);
		int expectedResult = 16;
		Assert.assertEquals(expectedResult, actualResult);
	}

	// Test Case for the Integer where max_Value at Second Position
	@Test
	public void given3IntegerValue_Case2_WhenGetMaximumNO_ShouldReturnCorrectMaxValue() {
		Maximum maximum = new Maximum();
		int actualResult = Maximum.findMax(10, 15, 11);
		int expectedResult = 15;
		Assert.assertEquals(expectedResult, actualResult);
	}

	// Test Case for the Integer where max_Value at Third Position
	@Test
	public void given3IntegerValue_Case3_WhenGetMaximumNO_ShouldReturnCorrectMaxValue() {
		Maximum maximum = new Maximum();
		int actualResult = Maximum.findMax(11, 10, 12);
		int expectedResult = 12;
		Assert.assertEquals(expectedResult, actualResult);
	}

	// Test Case for the float where max_Value at First Position
	@Test
	public void given3FloatValue_Case1_WhenGetMaximumNO_ShouldReturnCorrectMaxValue() {
		Maximum maximum = new Maximum();
		float actualResult = Maximum.findMax(11.2f, 10.3f, 9.4f);
		float expectedResult = 11.2f;
		Assert.assertEquals(expectedResult, actualResult);
	}
	// Test Case for the float where max_Value at second Position

	@Test
	public void given3FloatValue_Case2_WhenGetMaximumNO_ShouldReturnCorrectMaxValue() {
		Maximum maximum = new Maximum();
		float actualResult = Maximum.findMax(11.2f, 12.3f, 9.4f);
		float expectedResult = 12.3f;
		Assert.assertEquals(expectedResult, actualResult);
	}

	// Test Case for the float where max_Value at third Position

	@Test
	public void given3FloatValue_Case3_WhenGetMaximumNO_ShouldReturnCorrectMaxValue() {
		Maximum maximum = new Maximum();
		float actualResult = Maximum.findMax(11.2f, 10.3f, 99.4f);
		float expectedResult = 99.4f;
		Assert.assertEquals(expectedResult, actualResult);
	}

	// Test Case for the String where max_Value at First Position
	@Test
	public void given3StringValue_Case1_WhenGetMaximumNO_ShouldReturnCorrectMaxValue() {
		Maximum maximum = new Maximum();
		String actualResult = Maximum.findMax("Peach", "banana", "apple");
		String expectedResult = "Peach";
		Assert.assertEquals(expectedResult, actualResult);
	}

	// Test Case for the String where max_Value at Second Position
	@Test
	public void given3StringValue_Case2_WhenGetMaximumNO_ShouldReturnCorrectMaxValue() {
		Maximum maximum = new Maximum();
		String actualResult = Maximum.findMax("banana", "Peach", "apple");
		String expectedResult = "Peach";
		Assert.assertEquals(expectedResult, actualResult);
	}

//  Test Case for the String where max_Value at third Position
	@Test
	public void given3StringValue_Case3_WhenGetMaximumNO_ShouldReturnCorrectMaxValue() {
		Maximum maximum = new Maximum();
		String actualResult = Maximum.findMax("banana", "apple", "Peach");
		String expectedResult = "Peach";
		Assert.assertEquals(expectedResult, actualResult);
	}

}