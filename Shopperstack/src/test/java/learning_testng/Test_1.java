package learning_testng;

import org.testng.annotations.Test;

public class Test_1 {
	
	@Test
	public void a()
	{
		System.out.println("from @test");
	}

	public static void main(String[] args) {
		System.out.println("from main");
	}
}
