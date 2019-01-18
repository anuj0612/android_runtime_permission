package com.app.app.androidruntimepermission.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.app.app.androidruntimepermission.R;

/**
 *
 * Created by anuj mourya on 18 jan 2019
 *
 *
 */
public class SignupFragment extends Fragment {



    public SignupFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_signup, container, false);

        return view ;
    }

}
