package com.example.michael.autocompletewidgetexample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;

/**
 * Created by mikeh on 4/9/2016.
 */
public class Test extends AppCompatActivity {

    EditText search = null;

    public void onCreate(Bundle bundle){
        super.onCreate(bundle);
        setContentView(R.layout.content_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        search = (EditText) findViewById(R.id.myEditText);


    }

    public void launch(View v){
        Intent launch = new Intent(this, MainActivity.class);
        startActivity(launch);
    }

}
