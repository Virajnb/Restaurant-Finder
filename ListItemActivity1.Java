package com.example.android.restaurantfinder;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.HashMap;

public class ListItemActivity1 extends AppCompatActivity {
    TextView tv2, tv3, tv4, tv5;
    Button b2, b3;
    private Object view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_item1);
        tv2 = (TextView) findViewById(R.id.textView2);
        tv3 = (TextView) findViewById(R.id.textView3);
        tv4 = (TextView) findViewById(R.id.textView4);
        tv5 = (TextView) findViewById(R.id.textView5);
        b2 = (Button) findViewById(R.id.button2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i=new Intent(Intent.ACTION_CALL);
                i.setData(Uri.parse("tel:02230151537"));
                startActivity(i);
            }
        });}
        public void process(View view)
    {   Intent intent=null, chooser=null;
        if (view.getId()==R.id.button3)
        {
         intent=new Intent(android.content.Intent.ACTION_VIEW);
            intent.setData(Uri.parse("geo:18.9564644,72.8135207"));
            chooser=Intent.createChooser(intent,"Launch Maps");
            startActivity(chooser);
    }

    }
}
