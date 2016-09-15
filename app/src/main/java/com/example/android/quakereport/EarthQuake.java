package com.example.android.quakereport;

/**
 * Created by baba on 9/7/2016.
 */
public class EarthQuake {
    private String mPLace;
    private String mUrl;
    private long mTimeMilliSeconds;
    /**
     * Magnitude of the earthquake
     */
    private double mMagnitude;

    public EarthQuake(double mMagnitude, String mPLace, long milliseconds, String url) {
        this.mMagnitude = mMagnitude;
        this.mPLace = mPLace;
        mTimeMilliSeconds = milliseconds;
        mUrl = url;
    }

    public long mGetTimeMilliSeconds() {
        return mTimeMilliSeconds;
    }

    public double mGetMagnitude() {
        return mMagnitude;
    }

    public String getmPLace() {
        return mPLace;
    }

    public String getUrl() {
        return mUrl;
    }
}
