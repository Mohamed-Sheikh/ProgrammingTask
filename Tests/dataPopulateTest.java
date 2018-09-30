/*****************************************************************************/
/*                           Test Cases										 */
/*																			 */
/* 		                           										     */
/*****************************************************************************/

import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;
import com.bbc.*;

public class dataPopulateTest {

	private dataPopulate dataPopulate;

	ArrayList<String> websites = new ArrayList<String>();

	@Before
	public void setUp() throws Exception {

		dataPopulate = new dataPopulate();

	}

	/*
	 * Test case 1: Testing that the JSON Array is populated as expected, in this
	 * particular case, we are checking the number of URL entries against the size
	 * of the JSON array.
	 * 
	 */
	@Test
	public void JSONArrayIsPopulatedCorrectly() throws Exception {

		websites.add("https://www.bbc.com");
		websites.add("https://www.itv.com");
		websites.add("test");

		dataPopulate.dataStream(websites);

		
		assertEquals(dataPopulate.getJsonDoc().length(), websites.size());

	}
	/*
	 * Test case 2: Testing that the program correctly reports invalid URL's
	 * Note, if this test is run without accessing the internet, all URL's
	 * will be reported as invalid.
	 * 
	 */

	@Test
	public void badUrlReturnsCorrectMessage() throws Exception {

		websites.add("test");


		assertEquals("invalid url", dataPopulate.getJsonDoc().getJSONObject(2).get("Error"));

	}
}
