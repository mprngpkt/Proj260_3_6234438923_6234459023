package com.example.olymbus;

import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SignupFragment extends Fragment {

    String user, pass;
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_signup, container, false);

        Button btnSignup = view.findViewById(R.id.signupButton);
        Button back = view.findViewById(R.id.backloginButton);

        final EditText etUser = view.findViewById(R.id.userEditText);
        final EditText etPass = view.findViewById(R.id.passEditText);

        btnSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //user = etUser.getText().toString();
                //pass = etPass.getText().toString();

                //editor.putString("user", user);
                //editor.putString("pass", pass);
                //editor.apply();
                Toast.makeText(getContext(), "Registered", Toast.LENGTH_SHORT).show();

            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LoginFragment login = new LoginFragment();
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.fragment_container,login).commit();
            }
        });

        return view;
    }
}
