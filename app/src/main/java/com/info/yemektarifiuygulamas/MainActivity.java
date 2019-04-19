package com.info.yemektarifiuygulamas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText etKullaniciAdi,etSifre;
    private TextView tvSifreUnut;
    private Button buttonGiris,buttonKayit;

    private FirebaseAuth mAuth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etKullaniciAdi = findViewById(R.id.etKullaniciAdi);
        etSifre = findViewById(R.id.etSifre);
        buttonGiris = findViewById(R.id.buttonGiris);
        buttonKayit = findViewById(R.id.buttonKayit);
        tvSifreUnut = findViewById(R.id.tvSifreUnut);

        buttonGiris.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,AnaEkranActivity.class));
                finish();
            }
        });

        buttonKayit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,KullaniciKayitActivity.class));
            }
        });

        tvSifreUnut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,SifreUnutmaActivity.class));
            }
        });

    }


}
