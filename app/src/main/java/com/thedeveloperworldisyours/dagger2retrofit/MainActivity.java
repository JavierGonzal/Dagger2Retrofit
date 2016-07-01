package com.thedeveloperworldisyours.dagger2retrofit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.thedeveloperworldisyours.dagger2retrofit.model.Example;
import com.thedeveloperworldisyours.dagger2retrofit.service.ApiService;

import javax.inject.Inject;

import butterknife.Bind;
import butterknife.ButterKnife;
import retrofit.Callback;
import retrofit.Response;
import retrofit.Retrofit;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.activity_main_one)
    TextView mOneTextView;

    @Bind(R.id.activity_main_key)
    TextView mKeyTextView;

    @Inject
    ApiService apiService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((MyApplication) getApplication()).getComponent().inject(this);

        ButterKnife.bind(this);

        apiService.getExampleCall()
                .enqueue(new Callback<Example>() {
                    @Override
                    public void onResponse(Response<Example> response, Retrofit retrofit) {
                        displayExample(response);
                    }

                    @Override
                    public void onFailure(Throwable t) {

                    }
                });
    }

    private void displayExample(Response<Example> example) {
        mKeyTextView.setText(example.body().getKey().toString());
        mOneTextView.setText(example.body().getOne().toString());
    }
}
