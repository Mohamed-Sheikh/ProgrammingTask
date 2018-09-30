/*****************************************************************************/
/*                           Test Cases										 */
/*																			 */
/* 		                           										     */
/*****************************************************************************/


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import com.bbc.*;


public class AdditionalTaskTest {
	static ArrayList<String>websites = new ArrayList<String>();
	
	private AdditionalTask AdditionalTask;
	
	@Before
	public void setUp() throws Exception {
		AdditionalTask = new AdditionalTask();
		
	}
	
	/*
	 * Test case 1: Testing that the tally counter works as expected. In this
	 * test case both status codes should be the same as the URL's are identical.
	 * Therefore the first index of the array which stores the status codes should 
	 * be the same as the second. 
	 * 
	
	 * 
	 */
	@Test
	public void statusCodeCorrectTally() {
		dataPopulate dp = new dataPopulate();
		
		websites.add("https://www.bbc.com");
		websites.add("https://www.bbc.com");
		websites.add("test");
		websites.add("http://www.bbc.co.uk/mohamedsheikhbbc");
		dp.dataStream(websites);
		AdditionalTask.SortData(dp.bonus);
		
		
		 assertEquals(dp.bonus.get(0), dp.bonus.get(1));
		
		 
		
		
	}
	/*
	 * Test case 2: Testing that the program returns the right
	 * status code. In this test I know that the fourth URL added
	 * "http://www.bbc.co.uk/mohamedsheikhbbc" is fake and returns
	 * a 404 error, therefore we know that this status code, is different
	 * to the other URL's. We are checking that the status
	 * code returned for the fake URL is different to that of 
	 * the first URL which is an actual URL.
	 * 
	
	 * 
	 */
	
	@Test
	public void reportCorrectStatusCodes() {
		dataPopulate dp = new dataPopulate();
		

		dp.dataStream(websites);
		AdditionalTask.SortData(dp.bonus);
		
		
		 assertEquals(dp.bonus.get(0), dp.bonus.get(1));
		 assertFalse(dp.bonus.get(0).equals(dp.bonus.get(2)));
		
		
	}
	/*
	 * Test case 3: Testing that invalid URL's are 
	 * not added to our tally counter. The third URL
	 * added "test", is not a URL and therefore should 
	 * be added to our JSON file. Therefore, we should have
	 * 3 entries in our ArrayList.
	 * 
	
	 * 
	 */
	
	@Test
	public void invalidUrlsNotIncluded() {
		dataPopulate dp = new dataPopulate();
		

		dp.dataStream(websites);
		AdditionalTask.SortData(dp.bonus);
		
		 assertEquals(dp.bonus.size(), 3);
		 
		
		
	}


}

