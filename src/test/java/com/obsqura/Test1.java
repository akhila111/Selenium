package com.obsqura;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Test1
{
	@Test
	void verification()
	{
		SoftAssert assrt= new SoftAssert(); 
		assrt.assertTrue(2>1, "Test failed");
		assrt.assertTrue(2>5, "Test failed");
		//Assert.assertTrue(2>1, "Test failed");
		assrt.assertTrue(2>7, "Test failed");
		assrt.assertAll();
	}

}
//2>1
//5>3
//2>5