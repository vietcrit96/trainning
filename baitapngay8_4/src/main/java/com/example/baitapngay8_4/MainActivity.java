package com.example.baitapngay8_4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText edt_name;
    private CheckBox cb_kem;
    private CheckBox cb_scl;
    private Button btn_minus;
    private Button btn_plus;
    private TextView tv_sl;
    private TextView tv_backName;
    private TextView tv_addKem;
    private TextView tv_addScl;
    private TextView tv_quantity;
    private TextView tv_total;
    private Button btn_order;
    private Button btn_ok;

    private boolean kem=false;
//    private int scl;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        initWidgets();
        setOnClickListener();

    }

    public void initWidgets() {
        edt_name = findViewById( R.id.edt_name );
        cb_kem = findViewById( R.id.cb_kem );
        cb_scl = findViewById( R.id.cb_scl );
        tv_sl = findViewById( R.id.tv_sl );
        btn_minus = findViewById( R.id.btn_minus );
        btn_plus = findViewById( R.id.btn_plus );
        tv_backName = findViewById( R.id.tv_backName );
        tv_addKem = findViewById( R.id.tv_addKem );
        tv_addScl = findViewById( R.id.tv_addScl );
        tv_quantity = findViewById( R.id.tv_quantity );
        tv_total = findViewById( R.id.tv_total );
        btn_order = findViewById( R.id.btn_order );
        btn_ok = findViewById( R.id.btn_ok );
    }

    public void setOnClickListener() {
        btn_ok.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = edt_name.getText().toString();
                tv_backName.setText( "Name: " + name );
            }
        } );
        cb_kem.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cb_kem.isChecked()) {
                    tv_sl.setText( "0" );
                    cb_scl.setChecked( false );
                    kem = true;
                    tv_addKem.setText( "add Whipped Cream : true" );
                    tv_addScl.setText( "add Chocolate : false" );
                }
            }
        } );
        cb_scl.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cb_scl.isChecked()) {
                    tv_sl.setText( "0" );
                    cb_kem.setChecked( false );
                    kem = false;
                    tv_addKem.setText( "add Whipped Cream : false" );
                    tv_addScl.setText( "add Chocolate : true" );
                }
            }
        } );
        btn_minus.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int i = Integer.parseInt( tv_sl.getText().toString() );
                if (i > 0) {
                    i = i - 1;
                    tv_sl.setText( String.valueOf( i ) );
                    tv_quantity.setText( "Quantity: " + String.valueOf( i ) );
                    if (kem==true) {
                        tv_total.setText( "Total: " + String.valueOf( i * 10 ) + "$" );
                    } else if (kem==false) {
                        tv_total.setText( "Total: " + String.valueOf( i * 5 ) + "$" );
                    }
                }
            }
        } );
        btn_plus.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int i = Integer.parseInt( tv_sl.getText().toString() );
                i = i + 1;
                tv_sl.setText( String.valueOf( i ) );
                tv_quantity.setText( "Quantity: " + String.valueOf( i ) );
                if (kem==true) {
                    tv_total.setText( "Total: " + String.valueOf( i * 10 ) + "$" );
                } else if (kem==false) {
                    tv_total.setText( "Total: " + String.valueOf( i * 5 ) + "$" );
                }
            }

        } );

        btn_order.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText( MainActivity.this, "Tai khoan " + edt_name.getText().toString() + " bi tru " + tv_total.getText().toString(), Toast.LENGTH_SHORT ).show();
            }
        } );
    }
}
