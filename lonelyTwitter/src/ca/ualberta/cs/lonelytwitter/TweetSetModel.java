package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;

public class TweetSetModel
{
	ArrayList<LonelyTweetModel> tweetList = new ArrayList<LonelyTweetModel>();
	int count = 0;
	
	public int countTweets()
	{
		return count;
	}

	public void addTweet(NormalTweetModel normalTweetModel)
	{
		
		count++;
	}

	public ArrayList<LonelyTweetModel> getTweets()
	{
		return tweetList;
	}
	
}