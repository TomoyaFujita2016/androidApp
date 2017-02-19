package example.myapplication;

import android.media.Image;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.widget.Chronometer;
import android.widget.ImageButton;
import android.widget.ImageView;

public class StopWatch extends AppCompatActivity implements Chronometer.OnChronometerTickListener {
    int i = 0;
    long currentTime;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stop_watch);
    }

    public void onStart(View v) {
        ((Chronometer) findViewById(R.id.c)).setBase(SystemClock.elapsedRealtime());
        ((Chronometer) findViewById(R.id.c)).start();
        ((Chronometer)findViewById(R.id.c)).setOnChronometerTickListener(this);
        //((ImageView) findViewById(R.id.iv)).setImageResource(R.drawable.cat1);
    }

    public void onStop(View v) {
        ((Chronometer) findViewById(R.id.c)).stop();
        ((ImageView) findViewById(R.id.iv)).setImageResource(R.drawable.cat0);
    }

    @Override
    public void onChronometerTick(Chronometer chronometer) {
        currentTime = (SystemClock.elapsedRealtime() - chronometer.getBase()) / 1000;
        if(currentTime < 30) {
            if (i % 2 == 0) {
                ((ImageView) findViewById(R.id.iv)).setImageResource(R.drawable.cat1);
            } else {
                ((ImageView) findViewById(R.id.iv)).setImageResource(R.drawable.cat2);
            }
        }else{
            if (i % 2 == 0) {
                ((ImageView) findViewById(R.id.iv)).setImageResource(R.drawable.cat3);
            } else {
                ((ImageView) findViewById(R.id.iv)).setImageResource(R.drawable.cat4);
            }
        }
        i++;
    }
}
