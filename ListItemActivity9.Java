package com.example.android.restaurantfinder;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ListItemActivity9 extends AppCompatActivity {
    Button b18,b19;
    private Object view;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_item9);
        b18=(Button)findViewById(R.id.button18);
        b19=(Button)findViewById(R.id.button19);
        b18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Intent.ACTION_CALL);
                i.setData(Uri.parse("tel: 022 33951596"));
                startActivity(i);
            }
        });}
    public void process(View view)
    {   Intent intent=null, chooser=null;
        if (view.getId()==R.id.button19)
        {
            intent=new Intent(android.content.Intent.ACTION_VIEW);
            intent.setData(Uri.parse("geo:18.954092, 72.835787"));
            chooser=Intent.createChooser(intent,"Launch Maps");
            startActivity(chooser);
        }
    }
}
