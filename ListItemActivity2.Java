package com.example.android.restaurantfinder;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ListItemActivity2 extends AppCompatActivity {
    Button b4,b5;
    private Object view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_item2);
        b4=(Button)findViewById(R.id.button4);
        b5=(Button)findViewById(R.id.button5);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Intent.ACTION_CALL);
                i.setData(Uri.parse("tel:02230151148"));
                startActivity(i);
            }
        });}
        public void process(View view)
        {   Intent intent=null, chooser=null;
            if (view.getId()==R.id.button5)
            {
                intent=new Intent(android.content.Intent.ACTION_VIEW);
                intent.setData(Uri.parse("geo:18.953419,72.8162554"));
                chooser=Intent.createChooser(intent,"Launch Maps");
                startActivity(chooser);
            }

        }
    }
