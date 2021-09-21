package dataProvider;

import org.testng.annotations.DataProvider;

public class DataProviders {
	
		@DataProvider(name="DP1")
		public Object[][] dataProvider1()
		{
			Object[][] DP =new Object[][] {
				{"admin","123456"},
				{"admin","123456"}
			};
			return DP;
		
		}
		@DataProvider(name="DP")
		public Object[][] dataProvider2()
		{
			Object[][] DP =new Object[][] {
				{"user"},
				{"Tasks"},
				{"Calendar"}
			};
			return DP;
		
		}
		
}
