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
        mCustomView.addData(20.7);
        mCustomView.addData(46.6);
        mCustomView.addData(28.6);
        mCustomView.addData(14.5);
        mCustomView.addData(23.4);
        mCustomView.addData(27.4);
        mCustomView.addData(32.9);
        mCustomView.addData(28.3);
        mCustomView.addData(29);
        mCustomView.addData(34.8);
        mCustomView.addData(32.9);
        mCustomView.addData(16.7);
        mCustomView.addData(18);
        mCustomView.addData(27.5);

    }
}