package com.app.app.androidruntimepermission.Fragments;


import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.support.design.widget.TextInputEditText;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.app.app.androidruntimepermission.HomePageActivity;
import com.app.app.androidruntimepermission.R;

import org.w3c.dom.Text;

/**
 * Created by anuj mourya on 18 jan 2019
 * A simple {@link Fragment} subclass.
 */
public class SigninFragment extends Fragment {

    private TextView login_btn,forgot_password;
    private ImageView app_logo,fb_login,google_login;
    private TextInputEditText uername,password;
    private CheckBox rem_password;
    private ProgressBar progress_bar;

    public SigninFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_signin, container, false);
        login_btn = (TextView) view.findViewById(R.id.login_btn);


        login_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(),HomePageActivity.class));
            }
        });


        return view;
    }

}
