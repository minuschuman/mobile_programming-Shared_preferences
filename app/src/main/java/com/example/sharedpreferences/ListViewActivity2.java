package com.example.sharedpreferences;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class ListViewActivity2 extends AppCompatActivity {
    private ListView list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view2);
        list = findViewById(R.id.list);
        DataModel d =new DataModel();
        String[] names = d.getNames();
        String[] address = d.getAddress();

//        list.setAdapter(new CustomAdapter(this, names, address));
        list.setAdapter(new CustomAdapter(ListViewActivity2.this, names, address));
    }
}