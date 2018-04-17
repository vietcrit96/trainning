package com.example.bai20_datatranmission;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText edtType;
    private EditText edtDescrip;
    private Button btnSend;

    public static  String TYPE ="1";
    public static String DESCRIPTION="2" ;
    public static String BUNDLE="3" ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        edtType = findViewById( R.id.edt_type );
        edtDescrip = (EditText) findViewById( R.id.edt_descrip );
        btnSend = (Button) findViewById( R.id.btn_send );
        btnSend.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String type = edtType.getText().toString();
                String descrip = edtDescrip.getText().toString();
//                byExtras(type,descrip);
                byBundles(type,descrip);
            }


        } );
    }

//    private void byExtras(String type, String descrip) {
//        Intent intent = new Intent( MainActivity.this, ActivityB.class );
//        intent.putExtra( TYPE, type );
//        intent.putExtra( DESCRIPTION,descrip );
//        startActivity( intent );
//    }
    private void byBundles(String type, String descrip) {
        Intent intent = new Intent( MainActivity.this, ActivityB.class );
        Bundle bundle = new Bundle();
        bundle.putString( TYPE, type );
        bundle.putString( DESCRIPTION,descrip );
        intent.putExtra( BUNDLE, bundle );
        startActivity( intent );
    }
}
