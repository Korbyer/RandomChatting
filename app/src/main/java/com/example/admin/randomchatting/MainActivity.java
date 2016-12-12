package com.example.admin.randomchatting;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent signIntent=new Intent(MainActivity.this,GetStartedActivity.class);
        Intent registerIntent = new Intent(MainActivity.this,GetStartedActivity.class);
        startActivity(signIntent);
        startActivity(registerIntent);



    }
}
