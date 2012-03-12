package com.bourke.finch;

import android.app.Application;

import twitter4j.Twitter;
import android.net.Uri;

public class FinchApplication extends Application {

    private Twitter mTwitter;

    public static final int THEME_DARK = R.style.Theme_Finch;
    public static final int THEME_LIGHT = R.style.Theme_Finch_Light;

    public static int THEME = THEME_LIGHT;

    protected static final String CALLBACK_URL = "finch-callback:///";

    protected static final String CONSUMER_KEY = "7QIjyQd3cA8c8jn80tRtqw";
    protected static final String CONSUMER_SECRET =
        "yREZDaGBZfIGnlNGce9m80jRUKbnkYhZGT7XZkFZqg";

	protected static final String PREF_ACCESS_TOKEN = "accessToken";
	protected static final String PREF_ACCESS_TOKEN_SECRET =
        "accessTokenSecret";
	protected static final String PREF_SCREEN_NAME = "screenName";

    public static final Uri SCREEN_NAME_URI = Uri.parse(
            "content://com.bourke.finch.provider/screenname");

    protected static final String KEY_URL = "finchURL";


    public Twitter getTwitter() {
        return mTwitter;
    }

    public void setTwitter(Twitter twitter) {
        mTwitter = twitter;
    }

}
