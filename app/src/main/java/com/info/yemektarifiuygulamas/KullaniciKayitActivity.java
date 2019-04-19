package com.info.yemektarifiuygulamas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class KullaniciKayitActivity extends AppCompatActivity {
    private EditText etKullaniciAdi,etSifre;
    private Button buttonKayit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kullanici_kayit);

        etKullaniciAdi = findViewById(R.id.etKullaniciAdi);
        etSifre = findViewById(R.id.etSifre);
        buttonKayit = findViewById(R.id.buttonKayit);

        buttonKayit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(KullaniciKayitActivity.this,AnaEkranActivity.class));
                finish();
            }
        });
    }
}
