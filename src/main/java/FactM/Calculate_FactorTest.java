package FactM;

import static org.junit.Assert.*;

import org.junit.Test;


class Calculate_FactorTest {

	Calculate_Factor Factor=new Calculate_Factor();
	Calculate object1=Calculate_Factor.getCalculate("Standard_Material",2000.0);
	Calculate object2=Calculate_Factor.getCalculate("Above_Standard_Material",2500.0);
	Calculate object3=Calculate_Factor.getCalculate("High_Standard_Material",3000.0);
	Calculate object4=Calculate_Factor.getCalculate("High_Standard_Material_and_Automated",3500.0);
	private static final double DELTA = 1e-15;
	@Test
	public void test1() {	
		
		assertEquals(40000.0,object1.calcutate(20),DELTA);
	}
	@Test
	public void test2() {	
		
		assertEquals(50000.0,object2.calcutate(20),DELTA);
	}
	@Test
	public void test3() {	
		
		assertEquals(60000.0,object3.calcutate(20),DELTA);
	}
	@Test
	public void test4() {	
		
		assertEquals(70000.0,object4.calcutate(20),DELTA);
	}

}