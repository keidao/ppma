package com.peoplemoa.sample.common.http;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.loopj.android.http.JsonHttpResponseHandler;

public class SampleRestClientUsage {
    public void getPublicTimeline() {
        SampleRestClient.get("statuses/public_timeline.json", null, new JsonHttpResponseHandler() {
            public void onSuccess(JSONArray timeline) {
                // Pull out the first event on the public timeline
                JSONObject firstEvent;
                String tweetText;
				try {
					firstEvent = (JSONObject) timeline.get(0);
					tweetText = firstEvent.getString("text");
	                // Do something with the response

					System.out.println(tweetText);
				} catch (JSONException e) {
					e.printStackTrace();
				}
            }
        });
    }
}
