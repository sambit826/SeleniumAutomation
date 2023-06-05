package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import Generics.BasePage;
import Generics.BaseTest;

public class TestClass1 extends BaseTest{
	
	@Test
	public void t1() {
		basePage.validateTitle("actiTIME - Login");
	}
	@Test
	public void t4(){
		Assert.assertEquals(true, true);
	}
	
	@Test
	public void t2(){
		Assert.assertEquals(true, true);
	}
	
	@Test
	public void t3(){
		Assert.assertEquals(true, true);
	}
}
