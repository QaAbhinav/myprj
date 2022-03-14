package selbatch2;


	import org.testng.Assert;
	import org.testng.SkipException;
	import org.testng.annotations.Listeners;
	import org.testng.annotations.Test;

	@Listeners(Listner.class)

	public class DemoTest2 {
		@Test
		public void Test01(){
			System.out.println("testcase test01");
			Assert.assertEquals(1, 1);
		}
		@Test
		public void Test02(){
			System.out.println("testcase test02");
			Assert.assertEquals(1, 2);
		}
		@Test
		public void Test03(){
			System.out.println("testcase test03");
			throw new SkipException("skipping a testcase");
		} 
	}

