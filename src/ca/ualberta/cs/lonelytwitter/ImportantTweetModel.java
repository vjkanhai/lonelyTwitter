package ca.ualberta.cs.lonelytwitter;


public class ImportantTweetModel extends LonelyTweetModel
{
	public ImportantTweetModel(String text, Date timestamp)
	{
		super(text, timestamp);
	}
	public ImportantTweetModel(String text)
	{
		super(text);
	}
	public void setText(String text)
	{
		this.text = text;
	}
	public getTweetType()
	{
		type = "Important";
		return type;
	}
}
