package com.example.sharedpreferences;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ListViewActivity1 extends AppCompatActivity {
private ListView list;
String[] names = {
        "Ram","Hari","Prakash","Gita","Uma","Sara",
        "Ram","Hari","Prakash","Gita","Uma","Sara",
        "Ram","Hari","Prakash","Gita","Uma","Sara",
        "Ram","Hari","Prakash","Gita","Uma","Sara",
        "Ram","Hari","Prakash","Gita","Uma","Sara",
        "Ram","Hari","Prakash","Gita","Uma","Sara"
};
String[] address = {
        "nepal", "japan", "usa", "india", "german",
        "nepal", "japan", "usa", "india", "german",
        "nepal", "japan", "usa", "india", "german",
        "nepal", "japan", "usa", "india", "german",
        "nepal", "japan", "usa", "india", "german",
        "nepal", "japan", "usa", "india", "german"
};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view1);
        list = findViewById(R.id.list1);

//        list.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, names));
        list.setAdapter(new MyCustomAdapter(this, names, address));

//        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//                Toast.makeText(ListViewActivity1.this,names[i],Toast.LENGTH_LONG).show();
//            }
//        });
    }

}