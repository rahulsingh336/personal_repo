package test.epam;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Map;

public class OccerenceFinderTest {

	private OccerenceFinder occerenceFinder;

	@BeforeEach
	public void init(){
		occerenceFinder = new OccerenceFinder();
	}

	@Test
	public void test_empty_list(){
		Map response = occerenceFinder.findOccurence(new ArrayList());
		Assertions.assertEquals(0, response.size());
	}

	@Test
	public void test_with_int_list(){
		ArrayList items = new ArrayList();
		populateItems(items);

		Map response = occerenceFinder.findOccurence(items);

		Assertions.assertEquals(3, response.size());
		Assertions.assertEquals(2L, response.get(1));
		Assertions.assertEquals(1L, response.get(2));
		Assertions.assertEquals(1L, response.get(3));

	}

	private void populateItems(ArrayList items) {
		items.add(1);
		items.add(2);
		items.add(3);
		items.add(1);
	}
}
