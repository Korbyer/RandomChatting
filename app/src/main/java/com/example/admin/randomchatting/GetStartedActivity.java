package com.example.admin.randomchatting;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GetStartedActivity extends AppCompatActivity {
    private Button mSignInBtn;
    private Button mRegisterBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_started);

        mSignInBtn=(Button)findViewById(R.id.getStartedSignIn);
        mRegisterBtn=(Button)findViewById(R.id.getStartedRegister);

        mSignInBtn.setOnClickListener(new View.OnClickListener(){
           public void onClick(View view){
               Intent signIntent=new Intent(GetStartedActivity.this,SignInActivity.class);
               startActivity(signIntent);
           }
        });
        mRegisterBtn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent registerIntent = new Intent(GetStartedActivity.this,RegisterActivity.class);
                startActivity(registerIntent);
            }
        });
    }

}
