package com.example.tyler.weather_application;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private String[] mTodoList;


    private RecyclerView weatherRecyclerView;
    private WeatherAdapter weatherAdapter;
    private String[] weatherToastText;
    //private RecyclerView.LayoutManager weatherLayoutManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //setContentView(R.layout.weather_item);

        weatherRecyclerView = findViewById(R.id.rv_weather);
        //weatherLayoutManager = new LinearLayoutManager(this);
        weatherRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        weatherRecyclerView.setHasFixedSize(true);

        mTodoList = new String[19];
        mTodoList[0]="1";
        mTodoList[1]="2";
        mTodoList[2]="3";
        mTodoList[3]="3";
        mTodoList[4]="3";
        mTodoList[5]="3";
        mTodoList[6]="3";
        mTodoList[7]="3";
        mTodoList[8]="3";
        mTodoList[9]="3";
        mTodoList[10]="3";
        mTodoList[11]="3";
        mTodoList[12]="3";
        mTodoList[13]="3";
        mTodoList[14]="3";
        mTodoList[15]="3";
        mTodoList[16]="3";
        mTodoList[17]="3";
        mTodoList[18]="3";

        weatherToastText = new String [19];
        weatherToastText[0] = "1a";
        weatherToastText[1] = "2a";
        weatherToastText[2] = "3a";
        weatherToastText[3] = "4a";
        weatherToastText[4] = "5a";
        weatherToastText[5] = "6a";
        weatherToastText[6] = "7a";
        weatherToastText[7] = "8a";
        weatherToastText[8] = "9a";
        weatherToastText[9] = "10a";
        weatherToastText[10] = "11a";
        weatherToastText[11] = "12a";
        weatherToastText[12] = "13a";
        weatherToastText[13] = "14a";
        weatherToastText[14] = "15a";
        weatherToastText[15] = "16a";
        weatherToastText[16] = "17a";
        weatherToastText[17] = "18a";
        weatherToastText[18] = "19a";

        weatherAdapter = new WeatherAdapter(mTodoList, weatherToastText);
        weatherRecyclerView.setAdapter(weatherAdapter);

    }
}
