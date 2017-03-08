package com.example.berenice.fitness;

/**
 * Created by Berenice on 08/03/2017.
 */


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class CongratulationsActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_congratulations);
    }

    public void onDoneClick(View v){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
