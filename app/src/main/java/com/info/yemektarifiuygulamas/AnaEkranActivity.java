package com.info.yemektarifiuygulamas;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import java.util.ArrayList;


public class AnaEkranActivity extends AppCompatActivity {
    private Toolbar toolbar;
    private RecyclerView rv;
    private FloatingActionButton fab;

    private YemeklerAdapter adapter;
    private ArrayList<Yemekler> yemeklerArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ana_ekran);

        toolbar = findViewById(R.id.toolbar);
        rv = findViewById(R.id.rv);
        fab = findViewById(R.id.fab);

        toolbar.setTitle("Yemekler");
        toolbar.setSubtitle("kasimadalan@gmail.com");
        setSupportActionBar(toolbar);

        rv.setHasFixedSize(true);
        rv.setLayoutManager(new LinearLayoutManager(this));

        Yemekler y1=new Yemekler("","","pizza.png","Pizza","Fırında Pişir");
        Yemekler y2=new Yemekler("","","lazanya.png","Lazanya","Haşla Pişir");
        Yemekler y3=new Yemekler("","","kahve.png","Kahve","Suyu Kaynat");

        yemeklerArrayList = new ArrayList<>();
        yemeklerArrayList.add(y1);
        yemeklerArrayList.add(y2);
        yemeklerArrayList.add(y3);

        adapter = new YemeklerAdapter(this,yemeklerArrayList);
        rv.setAdapter(adapter);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(AnaEkranActivity.this,YemekKayitActivity.class));
            }
        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();

        Intent ıntent = new Intent(Intent.ACTION_MAIN);
        ıntent.addCategory(Intent.CATEGORY_HOME);
        ıntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(ıntent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.toolbar_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_cikis:
                startActivity(new Intent(AnaEkranActivity.this,MainActivity.class));
                finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
