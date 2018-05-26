package com.example.android.restaurantfinder;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ListItemActivity3 extends AppCompatActivity {
    Button b6,b7;
    private Object view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_item3);
        b6=(Button)findViewById(R.id.button6);
        b7=(Button)findViewById(R.id.button7);
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Intent.ACTION_CALL);
                i.setData(Uri.parse("tel:02233126809"));
                startActivity(i);
            }
        });}
        public void process(View view)
        {   Intent intent=null, chooser=null;
            if (view.getId()==R.id.button7)
            {
                intent=new Intent(android.content.Intent.ACTION_VIEW);
                intent.setData(Uri.parse("geo:18.9635136,72.8096289"));
                chooser=Intent.createChooser(intent,"Launch Maps");
                startActivity(chooser);
            }

        }
    }
