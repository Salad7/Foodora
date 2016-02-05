package com.example.salad.foodora;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

/**
 * Created by salad on 2/4/16.
 */
public class Login extends AppCompatActivity{

    private Button mLogin;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mLogin = (Button) findViewById(R.id.btnlogin);

        //On Button Click start main


    }
}
