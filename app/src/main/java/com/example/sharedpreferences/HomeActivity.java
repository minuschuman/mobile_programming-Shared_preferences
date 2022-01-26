package com.example.sharedpreferences;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class HomeActivity extends AppCompatActivity {
private Button btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        btn1 = findViewById(R.id.btnArrayAdapter);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeActivity.this, ListViewActivity1.class));
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.my_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if(id==R.id.menuLogout){
            SharedPreferences sp = getSharedPreferences("loginstate", MODE_PRIVATE);
            SharedPreferences.Editor et = sp.edit();
            et.remove("state");
            et.apply();
            Intent iLogout = new Intent(HomeActivity.this, MainActivity.class );
            startActivity(iLogout);
        }
        return true;
    }
}