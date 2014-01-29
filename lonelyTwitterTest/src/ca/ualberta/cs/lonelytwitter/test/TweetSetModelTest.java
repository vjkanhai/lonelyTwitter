package ca.ualberta.cs.lonelytwitter.test;


import java.util.ArrayList;
import android.test.ActivityInstrumentationTestCase2;
import ca.ualberta.cs.lonelytwitter.LonelyTwitterActivity;
import ca.ualberta.cs.lonelytwitter.NormalTweetModel;
import ca.ualberta.cs.lonelytwitter.TweetSetModel;


public class TweetSetModelTest extends ActivityInstrumentationTestCase2<LonelyTwitterActivity>
{

	public TweetSetModelTest()
	{
		super(LonelyTwitterActivity.class);
	}
	
	public void testCount()
	{
		TweetSetModel tweets = new TweetSetModel();
		assertEquals("tweet set should start empty", 0, tweets.countTweets());
		tweets.addTweet(new NormalTweetModel("test"));
		assertEquals("after adding the tweet the count should be count + 1", 1, tweets.countTweets());
	}
	
	public void testGet()
	{
		TweetSetModel tweets = new TweetSetModel();
		assertEquals("Not returning an arraylist", true, tweets.getTweets() instanceof ArrayList);
	}
	
	public void testAdd()
	{
		NormalTweetModel newTweet = new NormalTweetModel("test");
		TweetSetModel tweet = new TweetSetModel();
		tweet.addTweet(newTweet);		
	}

}