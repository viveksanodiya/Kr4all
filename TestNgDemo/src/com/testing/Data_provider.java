package com.testing;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_provider {
	@Test(dataProvider = "getdata")
	public void method1(String username, String password) {
		System.out.println(username);
		System.out.println(password);
	}

	@DataProvider
	public Object[][] getdata() {
		// row column
		Object[][] data = new Object[2][2];
		data[0][0] = "tet@test.com";
		data[0][1] = "secure@1234";
		data[1][0] = "test1@test.com";
		data[1][1] = "secure@5678";
		return data;

	}

}
