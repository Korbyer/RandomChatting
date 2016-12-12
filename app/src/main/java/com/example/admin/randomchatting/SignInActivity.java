package com.example.admin.randomchatting;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class SignInActivity extends AppCompatActivity {
    private Toolbar mSignInToolbar;
    private Button mSignInBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        mSignInToolbar=(Toolbar)findViewById(R.id.signInToolbar);
        /*setSupportActionBar(mSignInToolbar);//에러*/
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        mSignInBtn=(Button)findViewById(R.id.button2);

        mSignInBtn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent genderIntent=new Intent(SignInActivity.this,GenderActivity.class);
                startActivity(genderIntent);
            }
        });

    }
}
