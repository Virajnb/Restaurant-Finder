package com.example.android.restaurantfinder;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ListItemActivity4 extends AppCompatActivity {
    Button b8,b9;
    private Object view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_item4);
        b8=(Button)findViewById(R.id.button8);
        b9=(Button)findViewById(R.id.button9);
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Intent.ACTION_CALL);
                i.setData(Uri.parse("tel:02230151836"));
                startActivity(i);
            }
        });}
        public void process(View view)
        {   Intent intent=null, chooser=null;
            if (view.getId()==R.id.button9)
            {
                intent=new Intent(android.content.Intent.ACTION_VIEW);
                intent.setData(Uri.parse("geo:18.9428367,72.8246522"));
                chooser=Intent.createChooser(intent,"Launch Maps");
                startActivity(chooser);
            }

        }
    }
