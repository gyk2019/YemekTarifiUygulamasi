package com.info.yemektarifiuygulamas;

import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class YemekGuncellemeActivity extends AppCompatActivity {
    private ImageView ivResimTutucu;
    private EditText etYemekAdi,etYemekTarif;
    private Button buttonYemekGuncelle,buttonSil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yemek_guncelleme);

        ivResimTutucu = findViewById(R.id.ivResimTutucu);
        etYemekAdi = findViewById(R.id.etYemekAdi);
        etYemekTarif = findViewById(R.id.etYemekTarif);
        buttonYemekGuncelle = findViewById(R.id.buttonYemekGuncelle);
        buttonSil = findViewById(R.id.buttonSil);

        buttonYemekGuncelle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(YemekGuncellemeActivity.this,AnaEkranActivity.class));
                finish();
            }
        });

        buttonSil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Snackbar snackbar = Snackbar
                        .make(view, "Yemek Silinsin mi ?", Snackbar.LENGTH_LONG)
                        .setAction("Evet", new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {

                                Snackbar snackbar1 = Snackbar
                                        .make(view, "Yemek Silindi", Snackbar.LENGTH_LONG);

                                snackbar1.show();

                                startActivity(new Intent(YemekGuncellemeActivity.this,AnaEkranActivity.class));
                                finish();
                            }
                        });

                snackbar.show();

            }
        });

        ivResimTutucu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}
