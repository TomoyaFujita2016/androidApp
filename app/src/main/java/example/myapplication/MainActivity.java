package example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Chronometer;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onButton1(View v) {
        Intent intent = new Intent(this, Setting.class);    //set Act
        startActivity(intent);                              //open Act
    }

    public void onButton2(View v) {
        Intent intent = new Intent(this, Gallery.class);
        startActivity(intent);
    }
    public void onButton3(View v){
        Intent intent = new Intent(this, Pictures.class);
        startActivity(intent);
    }
    public void onButton4(View v){
        Intent intent = new Intent(this, StopWatch.class);
        startActivity(intent);
    }


}
