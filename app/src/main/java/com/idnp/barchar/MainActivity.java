package com.idnp.barchar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.Toast;

import com.idnp.barchar.views.CustomView;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    //ArrayList<String> tasaNatalidad = new ArrayList<>();
    private CustomView mCustomView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mCustomView = (CustomView) findViewById(R.id.customView);
        mCustomView.addData("Argentina", 20.7);
        mCustomView.addData("Bolivia",46.6);
        mCustomView.addData("Brazil",28.6);
        mCustomView.addData("Canada",14.5);
        mCustomView.addData("Chile",23.4);
        mCustomView.addData("Colombia",27.4);
        mCustomView.addData("Ecuador",32.9);
        mCustomView.addData("Guyana",28.3);
        mCustomView.addData("Mexico",29);
        mCustomView.addData("Paraguay",34.8);
        mCustomView.addData("Peru",32.9);
        mCustomView.addData("U.S.A.",16.7);
        mCustomView.addData("Uruguay",18);
        mCustomView.addData("Venezuela",27.5);

    }
}