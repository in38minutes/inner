package io.javabrains;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MathUtilsTest {

	@Test
	void testAdd() {
		MathUtils mathutils=new MathUtils();
		int expected=2;
		int actual=mathutils.add(1,1);
		assertEquals(expected, actual,"the method is add");
		}
	@Test
	void testComputeCircleRadius() {
		MathUtils mathutils=new MathUtils();
		assertEquals(3.14154455, mathutils.computeCircleArea(10), "should return right circle area");
	}

}
