package com.example.arsen.firstdemo;

import android.app.ActionBar;
import android.app.Fragment;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;

public class Change extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change);
        BottomNavigationView bottom=findViewById(R.id.navig);
         final Map_fr mapion=new Map_fr();
        final Wot_fr woter=new Wot_fr();
        final Prof_fr profil=new Prof_fr();
       FrameLayout prod=findViewById(R.id.frame);






        bottom.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case (R.id.mapid):
                        mapion.setMenuVisibility(true);
                        woter.setMenuVisibility(false);
                        profil.setMenuVisibility(false);
                        break;
                    case (R.id.woterid):
                        mapion.setMenuVisibility(false);
                        woter.setMenuVisibility(true);
                        profil.setMenuVisibility(false);
                        break;
                    case (R.id.profid):
                        mapion.setMenuVisibility(false);
                        woter.setMenuVisibility(false);
                        profil.setMenuVisibility(true);
                        break;
                }
                return true;
            }

        });
    }




}
