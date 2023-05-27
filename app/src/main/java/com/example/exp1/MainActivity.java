package com.example.exp1;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void impint(View V){
        Intent i = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com"));
        startActivity(i);
    }
    public void impint2(View V){
        Intent i = new Intent(Intent.ACTION_VIEW,Uri.parse("https://mail.google.com/"));
        startActivity(i);
    }
    public void impint3(View V) {
        Intent i = new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/"));
        startActivity(i);
    }

}
