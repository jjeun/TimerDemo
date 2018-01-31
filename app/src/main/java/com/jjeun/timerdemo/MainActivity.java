package com.jjeun.timerdemo;

import android.os.CountDownTimer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        final Handler handler = new Handler();
//        Runnable run = new Runnable() {
//            @Override
//            public void run() {
//                // insert code to be run every second.
//
//                Log.i("Runnable has run!", "a second must have passed....");
//                handler.postDelayed(this, 1000);
//            }
//        };
//
//        handler.post(run);

        new CountDownTimer(10000, 1000){

            public void onTick(long millisecondsUntilDone){
                //counter is counting down.

                Log.i("Seconds left: ", String.valueOf(millisecondsUntilDone/1000));
            }

            public void onFinish(){
                //counter is finished.
                Log.i("Done: ", "Count down timer is finished!");
            }
        }.start();
    }
}
