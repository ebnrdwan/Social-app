package com.example.rapcbo.sy.MainActivity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.example.rapcbo.sy.R;

/**
 * Created by RaPCBO on 25/02/18.
 */

public class Tab2 extends Fragment {

    Button button;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_tab2, container, false);


        return v;
    }


    public interface OnFragmentInteractionListener {
    }
}