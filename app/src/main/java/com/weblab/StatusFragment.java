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
import android.widget.TextView;

public class StatusFragment extends Fragment
{

    private TextView tvUserStatus;
    private Button btLogout;
    private OnLogoutListener listener;

    public StatusFragment()
    {
    }

    public interface OnLogoutListener
    {
        void performLogout();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.fragment_status, container, false);
        btLogout = view.findViewById(R.id.btLogout);
        tvUserStatus = view.findViewById(R.id.tvUserStatus);
        tvUserStatus.setText("Success. User: " + MainActivity.prefConfig.readName());

        btLogout.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                listener.performLogout();
            }
        });
        return view;
    }

    @Override
    public void onAttach(@NonNull Context context)
    {
        super.onAttach(context);
        Activity activity = (Activity) context;
        listener = (OnLogoutListener) activity;
    }
}
