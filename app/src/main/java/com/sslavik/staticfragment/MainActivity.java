package com.sslavik.staticfragment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity implements FragmentA.OnFragmentTextChange {

    private static final String TAG = "StaticFragments";
    private FragmentB fragmentB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "Activity -> onCreate()");
    }

    @Override
    public void onSetTextSize(int size) {

    }

    @Override
    public void onClickTextChange(String text) {

    }
}
