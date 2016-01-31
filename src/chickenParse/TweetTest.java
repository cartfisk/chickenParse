package chickenParse;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TweetTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void TestTweet() {
		String teststring= "new york, the. cartfisk.com/resume.pdf @hot #hastog @ @.cgjas http://google.com";
		Tweet tweet = new Tweet("new york, the. cartfisk.com/resume.pdf @hot #hastog @ @.cgjas http://google.com");
		assertEquals(tweet.getString(), teststring);
	}
	
	@Test
	public void TestIsMention() {
		String tweetstring = "new york, the. @cartfisk cartfisk.com/resume.pdf @hot #hashtog @ @.cgjas http://google.com";
		Tweet tweet = new Tweet(tweetstring);
		assertEquals(true, tweet.isMention("hot"));
		assertEquals(true, tweet.isMention("cartfisk"));
	}
	
	@Test
	public void TestIsHashtag() {
		String tweetstring = "new york, the. @cartfisk  #art.max cartfisk.com/resume.pdf @hot #hashtog @ @.cgjas http://google.com";
		Tweet tweet = new Tweet(tweetstring);
		assertEquals(true, tweet.isHashtag("art"));
		assertEquals(true, tweet.isHashtag("hashtog"));
	}
	
	/*@Test
	public void TestGetUrls() {
		String tweetstring = "new york, the. cartfisk.com/resume.pdf @hot #hashtog @ @.cgjas http://google.com @cartfisk";
		ArrayList<String> expectedUrls = new ArrayList<>();
		expectedUrls.add("cartfisk.com/resume.pdf");
		expectedUrls.add("http://google.com");
		Tweet tweet = new Tweet(tweetstring);
		assertEquals(tweet.getHashtags(), expectedUrls);
	}*/

}
