package com.example.bai18_customlistview;

import android.graphics.Color;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.bai18_customlistview.model.Contact;
import com.example.bai18_customlistview.model.adapter.CustomAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
private ListView lv_main;
    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        lv_main = findViewById( R.id.lv_main );

        ArrayList<Contact> arrayList = new ArrayList<>();
        Contact contact = new Contact( getColor( R.color.lamnhenhang ), "Phạm Quốc Việt", "0123456789" );
        Contact contact1 = new Contact( getColor(R.color.hongcatinh), "Phạm Quốc Việt", "0123456789" );
        Contact contact2 = new Contact( getColor( R.color.lucdamda ), "Phạm Quốc Việt", "0123456789" );
        Contact contact3 = new Contact( getColor( R.color.dochot ), "Phạm Quốc Việt", "0123456789" );
        Contact contact4 = new Contact( getColor( R.color.denxi ), "Phạm Quốc Việt", "0123456789" );
        arrayList.add( contact );
        arrayList.add( contact1 );
        arrayList.add( contact2 );
        arrayList.add( contact3 );
        arrayList.add( contact4 );
        CustomAdapter customAdapter = new CustomAdapter( this, R.layout.item_first_layout, arrayList );
        lv_main.setAdapter(customAdapter);
    }
}
