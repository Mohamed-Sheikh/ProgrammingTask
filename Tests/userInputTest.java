import static org.junit.Assert.*;
import org.junit.*;
import com.bbc.*;


public class userInputTest {
	
	private userInput userInput;
	
	@Before
	public void setUp() throws Exception {

	userInput = new userInput();
	}
	@Test
	public void URLIsStoredCorrectly () {
	userInput.data();
	
	
	
	 assertEquals(userInput.getNumberChoice(), userInput.URLs.size());
	 
	 
	}
}