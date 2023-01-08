package com.example.meat_packing;


import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Html;
import android.text.SpannableStringBuilder;

import android.widget.TextView;
import android.widget.Toolbar;


public class MainActivity extends AppCompatActivity {
    String strText;
    SpannableStringBuilder spannableStringBuilder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //TextView text2= (TextView) findViewById(R.id.text1_2);
      TextView text3 =(TextView)findViewById(R.id.text3_2);




        text3.setText((Html.fromHtml("<b>&nbsp&nbsp&nbsp&nbsp&nbsp 5 </b> <sub><small>&nbsp&nbsp g </small></sub>")));



       TextView text5=(TextView) findViewById(R.id.text5_2);
       text5.setText(Html.fromHtml("<b>&nbsp&nbsp&nbsp&nbsp&nbsp 0 </b> <sub><small>&nbsp&nbsp g </small></sub>"));

        androidx.appcompat.app.ActionBar actionBar = getSupportActionBar();

        actionBar.setDisplayShowCustomEnabled(true);
        actionBar.setDisplayShowTitleEnabled(true);
        getSupportActionBar().setCustomView(R.layout.actionbar);
        ColorDrawable colorDrawable
                = new ColorDrawable(getResources().getColor(R.color.grey));

        actionBar.setBackgroundDrawable(colorDrawable);
        //
        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
            text5.setText(Html.fromHtml("<b> 0 </b> <sub><small>&nbsp&nbsp g </small></sub>"));

            text3.setText((Html.fromHtml("<b> 5 </b> <sub><small>&nbsp&nbsp g </small></sub>")));
            getSupportActionBar().setCustomView(R.layout.tollland);




        }


    }


    }
