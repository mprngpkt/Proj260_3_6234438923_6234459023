package com.example.olymbus;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class LoginFragment extends Fragment{

    CallbackFragment callbackFragment;
    String user, pass;
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;

    @Override
    public void onAttach(@NonNull Context c) {
        sharedPreferences = c.getSharedPreferences("userFile",Context.MODE_PRIVATE);
        editor = sharedPreferences.edit();
        super.onAttach(c);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_login, container, false);

        Button btnLogin = view.findViewById(R.id.loginButton);
        Button btnSignup = view.findViewById(R.id.signupButton);

        final EditText etUser = view.findViewById(R.id.userEditText);
        final EditText etPass = view.findViewById(R.id.passEditText);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*user = etUser.getText().toString();
                pass = etPass.getText().toString();
                String uName = sharedPreferences.getString("user",null);
                String uPass = sharedPreferences.getString("pass",null);

                if(user.equals("Maprang") && pass.equals("123456")){*/
                    ProfileFragment profile = new ProfileFragment();
                    FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.fragment_container,profile).commit();
                /*}
                else{
                    Toast.makeText(getContext(), "Your username or password does not exists", Toast.LENGTH_SHORT).show();
                }*/
            }
        });

        btnSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SignupFragment signup = new SignupFragment();
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.fragment_container,signup).commit();
            }
        });

        return view;
    }

    /*public void setCallbackFragment(CallbackFragment callbackFragment){
        this.callbackFragment = callbackFragment;
    }*/

}
