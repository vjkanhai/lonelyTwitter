package ca.ualberta.cs.lonelytwitter.test;

import java.util.Date;

import android.test.ActivityInstrumentationTestCase2;
import ca.ualberta.cs.lonelytwitter.ImportantTweetModel;
import ca.ualberta.cs.lonelytwitter.LonelyTwitterActivity;
import ca.ualberta.cs.lonelytwitter.NormalTweetModel;

public class LonelyTweetModelTest extends ActivityInstrumentationTestCase2<LonelyTwitterActivity>
{

	public LonelyTweetModelTest()
	{
		super(LonelyTwitterActivity.class);
	}

	public void testFailure()
	{
		assertEquals("5 should equal 5", 5, 5);
	}
	
	public void equalsTest()
	{
		Date testdate = new Date();
		NormalTweetModel tweet1 = new NormalTweetModel("fu", testdate);
		ImportantTweetModel tweet2 = new ImportantTweetModel("fu", testdate);
		NormalTweetModel tweet3 = new NormalTweetModel("bar", testdate);
		NormalTweetModel tweet4 = new NormalTweetModel("bar", testdate);
		ImportantTweetModel tweet5 = new ImportantTweetModel("fu", testdate);
		assertEquals("Equals returns false on unequal tweet types (From NormalTweetModel)", false, tweet1.equals(tweet2));
		assertEquals("Equals returns false on unequal tweet types (From ImportantTweetModel)", false, tweet2.equals(tweet1));
		assertEquals("Equals returns false on unequal tweet text", false, tweet1.equals(tweet3));
		assertEquals("Equals returns true on equal tweets (NormalTweetModel version)", true, tweet4.equals(tweet3));
		assertEquals("Equals returns true on equal tweets (ImportantTweetModel version)", true, tweet5.equals(tweet2));
		fail("Like actually");
	}
}