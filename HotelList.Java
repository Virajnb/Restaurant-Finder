package com.example.android.restaurantfinder;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class HotelList extends AppCompatActivity {
    ListView listView;
    ArrayAdapter<String>adapter;
    String[]Restaurants=new String[]{"Canto","The Bombay Havelli","Grandmama's Cafe","Vortex South","The Clearing House","Tea Villa Cafe","Doolally Taproom","CANDY & GREEN","Faham Restaurant & Lounge","Soam","Oh! Calcutta"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel_list);
        listView=(ListView)findViewById(R.id.listView);
        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,Restaurants);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                int itempostion=position;
                Toast.makeText(getApplicationContext(),"position:"+itempostion+"List Item:"+Restaurants[position],Toast.LENGTH_SHORT).show();

                if (position==0){
                    Intent intent=new Intent(view.getContext(),ListItemActivity1.class);
                    startActivityForResult(intent,0);
                }
                if (position==1){
                    Intent intent=new Intent(view.getContext(),ListItemActivity2.class);
                    startActivityForResult(intent,1);
                }
                if (position==2){
                    Intent intent=new Intent(view.getContext(),ListItemActivity3.class);
                    startActivityForResult(intent,2);
                }
                if (position==3){
                    Intent intent=new Intent(view.getContext(),ListItemActivity4.class);
                    startActivityForResult(intent,3);
                }
                if (position==4){
                    Intent intent=new Intent(view.getContext(),ListItemActivity5.class);
                    startActivityForResult(intent,4);
                }
                if (position==5){
                    Intent intent=new Intent(view.getContext(),ListItemActivity6.class);
                    startActivityForResult(intent,5);
                }
                if (position==6){
                    Intent intent=new Intent(view.getContext(),ListItemActivity7.class);
                    startActivityForResult(intent,6);
                }
                if (position==7){
                    Intent intent=new Intent(view.getContext(),ListItemActivity8.class);
                    startActivityForResult(intent,7);
                }
                if (position==8){
                    Intent intent=new Intent(view.getContext(),ListItemActivity9.class);
                    startActivityForResult(intent,8);
                }
                if (position==9){
                    Intent intent=new Intent(view.getContext(),ListItemActivity10.class);
                    startActivityForResult(intent,9);
                }
                if (position==10){
                    Intent intent=new Intent(view.getContext(),ListItemActivity11.class);
                    startActivityForResult(intent,10);
                }
            }
        });
    }
}
