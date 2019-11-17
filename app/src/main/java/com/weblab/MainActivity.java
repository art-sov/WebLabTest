package com.weblab;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements LoginFragment.OnLoginFormActivityListener {

    private static PrefConfig prefConfig;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        prefConfig = new PrefConfig(this);

        if(findViewById(R.id.fragment_container) != null)
        {
            if (savedInstanceState != null)
            {
                return;
            }
            if (prefConfig.readLoginStatus())
            {
                getSupportFragmentManager().beginTransaction()
                        .add(R.id.fragment_container, new StatusFragment()).commit();
            }
            else
            {
                getSupportFragmentManager().beginTransaction()
                        .add(R.id.fragment_container, new LoginFragment()).commit();
            }
        }
    }

    @Override
    public void performRegister() {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment_container, new RegistrationFragment())
                .addToBackStack(null)
                .commit();
    }

    @Override
    public void performLogin(String name) {

    }
}
