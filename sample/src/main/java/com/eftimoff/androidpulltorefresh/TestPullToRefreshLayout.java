package com.eftimoff.androidpulltorefresh;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;

import com.eftimoff.pulltorefresh.BasePullToRefreshLayout;
import com.eftimoff.pulltorefresh.listeners.OnPullToRefreshListener;

public class TestPullToRefreshLayout extends BasePullToRefreshLayout {

    public TestPullToRefreshLayout(final Context context) {
        super(context);
    }

    public TestPullToRefreshLayout(final Context context, final AttributeSet attrs) {
        super(context, attrs);
        setOnPullToRefreshListener(new OnPullToRefreshListener() {
            @Override
            public void onStart() {
                Log.i("!!!!!!!!!!!!!!!!!!!!!", "onStart");
            }

            @Override
            public void onPercent(final float percent, final boolean invalidate) {
                Log.i("!!!!!!!!!!!!!!!!!!!!!", "onPercent : " + percent + " " + invalidate);
            }

            @Override
            public void onStop() {
                Log.i("!!!!!!!!!!!!!!!!!!!!!", "onStop");
            }
        });
    }

    @Override
    public View getRefreshView() {
        return LayoutInflater.from(getContext()).inflate(R.layout.example_headers, null, false);
    }

    @Override
    public int getDragMaxDistance() {
        return 150;
    }

    @Override
    public boolean parallax() {
        return false;
    }
}
