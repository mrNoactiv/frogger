package com.example.gruti.frogger;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
        //ssss
    }


    public void ClickNewGame(View view) {
        Intent LunchNewGame=new Intent(this,GameActivity.class);
        startActivity(LunchNewGame);

    }
}
