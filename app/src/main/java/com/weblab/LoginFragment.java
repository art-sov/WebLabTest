package com.weblab;


import android.app.Activity;
import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.weblab.model.User;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LoginFragment extends Fragment
{

    private TextView tvRegister;
    private EditText etEmail;
    private EditText etPassword;
    private Button btLogin;

    private OnLoginFormActivityListener listener;

    public LoginFragment()
    {
        // Required empty public constructor
    }

    public interface OnLoginFormActivityListener
    {
        void performRegister();
        void performLogin(String name);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        View view =  inflater.inflate(R.layout.fragment_login, container, false);
        tvRegister = view.findViewById(R.id.tvRegistrate);
        etEmail = view.findViewById(R.id.etEmail);
        etPassword = view.findViewById(R.id.etPassword);
        btLogin = view.findViewById(R.id.btLogin);

        tvRegister.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                listener.performRegister();
            }
        });

        btLogin.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                performLogin();
            }
        });
        return view;
    }

    @Override
    public void onAttach(@NonNull Context context)
    {
        super.onAttach(context);
        Activity activity = (Activity) context;
        listener = (OnLoginFormActivityListener) activity;
    }

    private void performLogin()
    {
        String email = etEmail.getText().toString();
        String password = etPassword.getText().toString();

        Call<User> call = MainActivity.apiService.performUserLogin(email, password);
        call.enqueue(new Callback<User>()
        {
            @Override
            public void onResponse(@NonNull Call<User> call, @NonNull Response<User> response)
            {
                if (response.isSuccessful() && response.body() != null)
                {
                    if (response.body().getResponse().equals("ok"))
                    {
                        MainActivity.prefConfig.writeLoginStatus(true);
                        listener.performLogin(response.body().getName());
                    }
                    else if (response.body().getResponse().equals("failed"))
                    {
                        MainActivity.prefConfig.displayToast("Login failed");
                    }
                }
            }

            @Override
            public void onFailure(@NonNull Call<User> call, @NonNull Throwable t)
            {

            }
        });

        etEmail.setText("");
        etPassword.setText("");
    }
}
