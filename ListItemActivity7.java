package com.example.android.restaurantfinder;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ListItemActivity7 extends AppCompatActivity {
    Button b14,b15;
    private Object view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_item7);
        b14=(Button)findViewById(R.id.button14);
        b15=(Button)findViewById(R.id.button15);
        b14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Intent.ACTION_CALL);
                i.setData(Uri.parse("tel:+91 7400171638"));
                startActivity(i);
            }
        });}
    public void process(View view)
    {   Intent intent=null, chooser=null;
        if (view.getId()==R.id.button15)
        {
            intent=new Intent(android.content.Intent.ACTION_VIEW);
            intent.setData(Uri.parse("geo:18.975258, 72.806231"));
            chooser=Intent.createChooser(intent,"Launch Maps");
            startActivity(chooser);
        }
    }
}
