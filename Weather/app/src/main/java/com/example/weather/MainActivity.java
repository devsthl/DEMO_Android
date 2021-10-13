package com.example.weather;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<WeatherEntity> listCountry = new ArrayList<WeatherEntity>();
    private ListView mList;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mList = (ListView) findViewById(R.id.list);
        init();
        AdapterWeather adapter = new AdapterWeather(MainActivity.this, R.layout.activity_list, listCountry);
        mList.setAdapter(adapter);
    }

    public void init() {
        WeatherEntity lab01 = new WeatherEntity(R.drawable.thunder, "Berlin", "Thunder", 0);
        listCountry.add(lab01);
        WeatherEntity lab02 = new WeatherEntity(R.drawable.sunny, "London", "Storm", 10);
        listCountry.add(lab02);
    }
}