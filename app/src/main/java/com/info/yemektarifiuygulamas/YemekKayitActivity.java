package com.info.yemektarifiuygulamas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class YemekKayitActivity extends AppCompatActivity {
    private ImageView ivResimTutucu;
    private EditText etYemekAdi,etYemekTarif;
    private Button buttonYemekKayit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yemek_kayit);

        ivResimTutucu = findViewById(R.id.ivResimTutucu);
        etYemekAdi = findViewById(R.id.etYemekAdi);
        etYemekTarif = findViewById(R.id.etYemekTarif);
        buttonYemekKayit = findViewById(R.id.buttonYemekKayit);

        buttonYemekKayit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(YemekKayitActivity.this,AnaEkranActivity.class));
                finish();
            }
        });

        ivResimTutucu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}
