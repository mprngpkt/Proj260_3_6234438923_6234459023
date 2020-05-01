package com.example.olymbus;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class ProfileFragment extends Fragment{

    CallbackFragment callbackFragment;

    @Override
    public void onAttach(@NonNull Context c) {
        SharedPreferences sharedPreferences = c.getSharedPreferences("userFile",Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        super.onAttach(c);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_login, container, false);

        Button btnLogin = view.findViewById(R.id.loginButton);
        Button btnSignup = view.findViewById(R.id.signupButton);

        EditText etUser = view.findViewById(R.id.userEditText);
        EditText etPass = view.findViewById(R.id.passEditText);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //
            }
        });

        btnSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(callbackFragment!=null){
                    callbackFragment.changeFragment();
                }
            }
        });

        return view;
    }

    public void setCallbackFragment(CallbackFragment callbackFragment){
        this.callbackFragment = callbackFragment;
    }

}
