package com.example.bai18_customlistview.model.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.bai18_customlistview.R;
import com.example.bai18_customlistview.model.Contact;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import static android.content.ContentValues.TAG;

public class CustomAdapter extends ArrayAdapter<Contact>{
    private Context context;
    private int resource;
    private ArrayList<Contact> arrayContact;
    public CustomAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Contact> objects) {
        super( context, resource, objects );
        this.context = context;
        this.resource = resource;
        this.arrayContact = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        convertView = LayoutInflater.from( context ).inflate( R.layout.item_first_layout, parent, false );
        TextView tv_mausac = convertView.findViewById( R.id.tv_mausac );
        TextView tv_ten = convertView.findViewById( R.id.tv_ten);
        TextView tv_sdt = convertView.findViewById( R.id.tv_sdt );

        Contact contact = arrayContact.get( position );
        tv_mausac.setBackgroundColor(contact.getmColor());
        tv_mausac.setText((position+1)+"");
        tv_ten.setText(contact.getmName());
        tv_sdt.setText(contact.getmNumber());
        Log.d( TAG, "getView: "+position );
        return convertView;
    }
}
