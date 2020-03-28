package com.github.novotnyr.android.driko;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.activity_main, new MasterFragment())
                .commit();

        ViewModelProvider vmProvider = new ViewModelProvider(this);
        CityViewModel cityViewModel = vmProvider.get(CityViewModel.class);
        cityViewModel.getSelectedCity().observe(this, this::showDetailFragment);
    }

    private void showDetailFragment(String city) {
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.activity_main, new DetailFragment())
                .addToBackStack(null)
                .commit();
    }
}
