package com.example.bai20_datatranmission;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ActivityB extends AppCompatActivity {
    private TextView tvType;
    private TextView tvDescrip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_b );
        tvType = (TextView) findViewById( R.id.tv_type );
        tvDescrip = (TextView) findViewById( R.id.tv_descrip );
//        Intent intent = getIntent();
//        String type = intent.getStringExtra( MainActivity.TYPE );
//        String descrip = intent.getStringExtra( MainActivity.DESCRIPTION );
//        tvType.setText( type );
//        tvDescrip.setText( descrip );
        Intent intent = getIntent();
        Bundle bundle = intent.getBundleExtra(MainActivity.BUNDLE);
        String type = bundle.getString( MainActivity.TYPE );
        String descrip = bundle.getString( MainActivity.DESCRIPTION );
        tvType.setText( type );
        tvDescrip.setText( descrip );
    }
}
