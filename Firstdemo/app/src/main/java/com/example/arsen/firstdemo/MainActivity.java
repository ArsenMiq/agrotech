package com.example.arsen.firstdemo;

import android.content.Intent;
import android.os.TokenWatcher;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import br.com.bloder.magic.view.MagicButton;

public class MainActivity extends AppCompatActivity {

    MagicButton but_wot, but_map, but_note;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        but_wot=findViewById(R.id.magic_button_water);
        but_map=findViewById(R.id.magic_button_maps);
        but_note=findViewById(R.id.magic_button_notes);

        but_wot.setMagicButtonClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplication(),Login.class);
                startActivity(intent);
            }
        });
        but_map.setMagicButtonClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplication(),MapsActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.demo_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.menu_one:
                Toast.makeText(this,"Item1",Toast.LENGTH_SHORT);
                return true;
            case R.id.menu_two:
                Toast.makeText(this,"Item2",Toast.LENGTH_SHORT);
                return true;
            case R.id.menu_tree:
                Toast.makeText(this,"Item3",Toast.LENGTH_SHORT);
                return true;
            case R.id.menu_four:
                Toast.makeText(this,"Item4",Toast.LENGTH_SHORT);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
