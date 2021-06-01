package com.example.example_1;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.time.Instant;

public class MainActivity extends AppCompatActivity {
       EditText name,number,link;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = findViewById(R.id.Name);
        number = findViewById(R.id.number);
        link = findViewById(R.id.link);
    }

    public void next(View view) {
        //here we wil work with the explicit intent
        String n = name.getText().toString();
        //Intent onj=new intent (present class,next class)
        //startactivity(obj)
        Intent i = new Intent(this,SecondActivity.class);
         i.putExtra("key",n);
        startActivity(i);
    }

    public void dial(View view) {
        //here we work with Implicit intent
        String n = number.getText().toString();
        //uri - Unified resource identifier
        // phone - tel;web - https://, loc - geo:lat,lon
        Uri uri = Uri.parse ("tel:"+n);
        Intent i = new Intent(Intent.ACTION_DIAL,uri);
        startActivity(i);
    }

    public void search(View view) {
        String n = link.getText().toString();
        Uri uri = Uri.parse("https://");
        Intent i = new Intent(Intent.ACTION_VIEW,uri);
        startActivity(i);
    }
}