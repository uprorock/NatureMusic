package com.example.prorock.naturemusic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button helloButton = (Button) findViewById(R.id.helloButton);

    }

    public void onMyButtonClick(View v)
    {
        //Toast.makeText(MainActivity.this, "Hello World", Toast.LENGTH_SHORT).show();

        TextView helloText = (TextView)findViewById(R.id.textView1);
        helloText.setText("Make your own kind of music");
    }
}
