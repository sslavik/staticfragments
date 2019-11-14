package com.sslavik.staticfragment;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;


public class FragmentC extends Fragment {
    private static final String TAG = "StaticFragment";
    private WebView wbExample;



    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragmentc, container, false);
        // SOLO DESPUES DE INFLAR LA VISTA SE PUEDE ENCONTRAR LAS VISTAS CONTENIDAS
        Log.d(TAG, "FragmentC -> OnCreateView()");

        return view;
    }

    /**
     * Se utiliza este método para poder instanciar las vistas después de que se "infle" la vista "Inflater.Inflate()"
     * @param view
     * @param savedInstanceState
     */
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        // INSTANCIAMOS
        wbExample = (WebView) view.findViewById(R.id.wbExample);
        // CARGAMOS LOS DATOS
        String html = getResources().getString(R.string.wbExample);
        wbExample.loadData(html,"text/html", "UTF-8");
        Log.d(TAG, "FragmentC -> OnViewCreated");

    }
}
