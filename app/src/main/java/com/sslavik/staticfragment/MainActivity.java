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
        // BUSCAMOS LA VISTA DEL FRAGMENT
        fragmentB = (FragmentB) getSupportFragmentManager().findFragmentById(R.id.fragmentb);
        Log.d(TAG, "Activity -> onCreate()");
    }

    @Override
    public void onSetTextSize(int size) {
        // La activity puede realizar cualquier operacion o comprobacion de los datos antes de pasárselo al Fragment --> Clase Controladora
        fragmentB.setMessageSize(size);
    }

    @Override
    public void onClickTextChange(String text) {
        fragmentB.setTextMessage(text);
    }
}
