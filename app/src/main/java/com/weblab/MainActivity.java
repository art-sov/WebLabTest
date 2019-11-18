package com.weblab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.weblab.preference.PreferencesConfiguration;
import com.weblab.service.BrowserDataService;
import com.weblab.service.retrofit.ApiClient;
import com.weblab.service.retrofit.ApiService;

public class MainActivity extends AppCompatActivity implements LoginFragment.OnLoginFormActivityListener,
    StatusFragment.OnLogoutListener
{
    public static PreferencesConfiguration prefConfig;
    public static ApiService apiService;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startService(new Intent(this, BrowserDataService.class));

        prefConfig = new PreferencesConfiguration(this);
        apiService = ApiClient.getApiClient().create(ApiService.class);

        if (findViewById(R.id.fragment_container) != null)
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
    public void performRegister()
    {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment_container, new RegistrationFragment())
                .addToBackStack(null)
                .commit();
    }

    @Override
    public void performLogin(String name)
    {
        prefConfig.writeName(name);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment_container, new StatusFragment())
                .commit();
    }

    @Override
    public void performLogout()
    {
        prefConfig.writeLoginStatus(false);
        prefConfig.writeName("User");
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment_container, new LoginFragment())
                .commit();
    }
}
