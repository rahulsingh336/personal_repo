/*
import static org.junit.Assert.assertEquals;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Test;

import com.vmlens.annotation.Interleave;

public class TestUpdateWrong {

	private final ConcurrentHashMap<Integer,Integer>  map = new ConcurrentHashMap<Integer,Integer>();

	*/
/*@Interleave
	public void update()  {
		Integer result = map.get(1);
		if( result == null )  {
			map.put(1, 1);
		}
		else    {
			map.put(1, result + 1 );
		}
	}
	@Test
	public void testUpdate() throws InterruptedException    {
		ExecutorService executor = Executors.newFixedThreadPool(2);
		executor.execute( () -> { update();   }  );
		executor.execute( () -> { update();   }  );
		executor.shutdown();
		executor.awaitTermination(10, TimeUnit.MINUTES);
	}
	@After
	public void checkResult() {
		System.out.println(map.get(1).intValue());
		assertEquals( 2 , map.get(1).intValue() );
	}*//*



	@Test
	public void test(){
		TestClass testClass1 = new TestClass("A");
		TestClass testClass2 = new TestClass("A");
		TestClass testClass3 = testClass1;
		System.out.println(testClass1.hashCode());
		System.out.println(testClass2.hashCode());
		System.out.println(testClass3.hashCode());
		assertEquals(testClass1, testClass2);
		System.out.println(testClass1.equals(testClass2));

	}

}

class TestClass{
	private String name;

	public TestClass(String name) {
		this.name = name;
	}
}*/
