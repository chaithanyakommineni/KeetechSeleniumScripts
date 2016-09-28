import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;


public class demoOne {

	
	
	@Test
	public void firstTestCase()
	{
		System.out.println("im in first test case from demoOne Class");
	}
	
	@Test
	public void secondTestCase()
	{
		System.out.println("im in second test case from demoOne Class");
	}
	public class demoTwo {
		@Test
		public void firstTestCase()
		{
			System.out.println("im in first test case from demoTwo Class");
		}
		
		@Test
		public void secondTestCase()
		{
			System.out.println("im in second test case from demoTwo Class");
		}
	}
	public class demoThree {
		@Test
		public void firstTestCase()
		{
			System.out.println("im in first test case from demoThree Class");
		}
		@Test
		public void secondTestCase()
		{
			System.out.println("im in second test case from demoThree Class");
		}
	}
}
