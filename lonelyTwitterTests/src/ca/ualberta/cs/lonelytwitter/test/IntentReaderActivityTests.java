package ca.ualberta.cs.lonelytwitter.test;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.test.ActivityInstrumentationTestCase2;
import android.view.View;
import android.widget.TextView;
import ca.ualberta.cs.lonelytwitter.IntentReaderActivity;


@SuppressLint("NewApi")
public class IntentReaderActivityTests extends
		ActivityInstrumentationTestCase2<IntentReaderActivity>
{

	public IntentReaderActivityTests()
	{
		super(IntentReaderActivity.class);
	}
	
	public void testSendText() {
		Intent intent = new Intent();
		String text = "hello!";
		intent.putExtra(IntentReaderActivity.TEXT_KEY, text);
		setActivityIntent(intent);
		IntentReaderActivity activity = getActivity();
		
		assertNotNull(activity);
		
		assertEquals("IntentReaderActivity should get text from intent", text, activity.getText());
	}
	
	public void testDoubleText() {
		Intent intent = new Intent();
		String text = "hello!";
		intent.putExtra(IntentReaderActivity.TEXT_KEY, text);
		intent.putExtra(IntentReaderActivity.TRANSFORM_KEY, IntentReaderActivity.DOUBLE);
		setActivityIntent(intent);
		IntentReaderActivity activity = getActivity();
		
		assertNotNull(activity);
		
		assertEquals("IntentReaderActivity should get text + text from intent", text + text, activity.getText());
	}
	
	public void testReverseText() {
		Intent intent = new Intent();
		String text = "Hello!";
		String reverseText = "!olleH";
		intent.putExtra(IntentReaderActivity.TEXT_KEY, text);
		intent.putExtra(IntentReaderActivity.TRANSFORM_KEY, IntentReaderActivity.REVERSE);
		setActivityIntent(intent);
		IntentReaderActivity activity = getActivity();
		assertEquals("IntentReaderActivity should get reversed text from intent", reverseText, activity.getText());
	}
	
	public void testMessageDisplayed() {
		Intent intent = new Intent();
		String text = null;
		String message = "Nothing here!";
		intent.putExtra(IntentReaderActivity.TEXT_KEY, text);
		intent.putExtra(IntentReaderActivity.TRANSFORM_KEY, IntentReaderActivity.NORMAL);
		setActivityIntent(intent);
		IntentReaderActivity activity = getActivity();
		TextView textView = (TextView) activity.findViewById(ca.ualberta.cs.lonelytwitter.R.id.intentText);
		assertEquals("Text should be null", text, activity.getText());
		assertEquals("Message is displayed", message, textView.getText().toString());
	}
	
	public void testViewShown() {
		Intent intent = new Intent();
		String text = null;
		intent.putExtra(IntentReaderActivity.TEXT_KEY, text);
		intent.putExtra(IntentReaderActivity.TRANSFORM_KEY, IntentReaderActivity.NORMAL);
		setActivityIntent(intent);
		IntentReaderActivity activity = getActivity();
		TextView textView = (TextView) activity.findViewById(ca.ualberta.cs.lonelytwitter.R.id.intentText);
		View root = (View) activity.findViewById(ca.ualberta.cs.lonelytwitter.R.id.body);
		assertOnScreen(root, textView);
	}

}
