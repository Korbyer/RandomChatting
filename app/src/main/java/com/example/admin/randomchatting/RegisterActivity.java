package com.example.admin.randomchatting;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class RegisterActivity extends AppCompatActivity {
    private Toolbar mRegisterToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        mRegisterToolbar=(Toolbar)findViewById(R.id.registerToolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }
}
