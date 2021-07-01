import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SubStringUnitTest {

	private SubStringTest SubStringTest;

	@BeforeEach
	public void init(){
		SubStringTest = new SubStringTest();
	}

	@Test
	public void testIndexof_If_SubString_Not_Passed(){
		int resposne = SubStringTest.indexOf("Mock", "");
		Assertions.assertEquals(resposne, -1);

	}

	@Test
	public void testIndexof_If_SubString_IS_Passed(){
		int resposne = SubStringTest.indexOf("Mock", "ck");
		Assertions.assertEquals(resposne, 2);
	}

	@Test
	public void testIndexof_If_SubString_IS_Not_Present(){
		int resposne = SubStringTest.indexOf("Mock", "test");
		Assertions.assertEquals(resposne, -1);


	}

	@Test
	public void testIndexof_If_SubString_IS__Present(){
		//SubStringTest.g(10,20);
		int resposne = SubStringTest.indexOf("MockMockMock", "ock");
		Assertions.assertEquals(resposne, 1);
	}
}
