package com.bourke.finch.fragments;

import com.bourke.finch.common.tasks.TwitterTask;

public class ConnectionsTimelineFragment extends BaseTimelineFragment {

    private static final String TAG = "Finch/ConnectionsTimelineFragment";

    public ConnectionsTimelineFragment() {
        super(TwitterTask.GET_MENTIONS);
    }

    @Override
    public void onResume() {
        super.onResume();
        refresh();
    }

    public void setupActionMode() {
        // TODO
    }
}
