/*****************************************************************************/
/*                           Test Cases										 */
/*					(Requires users input to run tests) 					 */
/* 		                           										     */
/*****************************************************************************/
import static org.junit.Assert.*;
import org.junit.*;
import com.bbc.*;
public class userInputTest {

	private userInput userInput;

	@Before
	public void setUp() throws Exception {

		userInput = new userInput();

	}

	/*
	 * Test case 1: Testing that the URL's input by the user are stored correctly
	 * in the data type (ArrayList)
	 */
	@Test
	public void URLIsStoredCorrectly() {
		userInput.data();

		assertEquals(userInput.noOfUrl, userInput.getUserInput().size());

	}

	/*
	 * Test case 2: Testing that the ArrayList that holds the users URL is not null -
	 * in other words testing that the ArrayList has been populated.
	 */
	@Test
	public void arrayListNotNull() {

		assertNotNull(userInput.getUserInput().size());

	}

}