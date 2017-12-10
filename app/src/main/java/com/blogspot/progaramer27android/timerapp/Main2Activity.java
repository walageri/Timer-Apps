package com.blogspot.progaramer27android.timerapp;

import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    TextView show;
    Timer timer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        show=(TextView)findViewById(R.id.text2);
        timer= new Timer(10000,1000) ;

        show.setText("10");
        String text = show.getText().toString();
        if (text.equalsIgnoreCase("selsai")){

        }


    }
    public void start(View view){
        timer.start();
    }
    public void stop(View view){
        timer.cancel();
    }
    public void next(View view){
        startActivity(new Intent(this,Main3Activity.class));
    }
    public class Timer extends CountDownTimer {

        public Timer( long millisInFuture, long countDownInterval){
            super(millisInFuture, countDownInterval);
        }

        @Override
        public void onTick ( long l){
            show.setText("" + (l / 1000));
        }

        @Override
        public void onFinish () {
            show.setText("selsai");
            startActivity(new Intent(Main2Activity.this,Main3Activity.class));
        }

    }


    @Override
    public void onBackPressed() {
    }
}
