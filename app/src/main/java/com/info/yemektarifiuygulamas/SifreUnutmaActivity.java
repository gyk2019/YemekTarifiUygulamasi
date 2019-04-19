package com.info.yemektarifiuygulamas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SifreUnutmaActivity extends AppCompatActivity {
    private EditText etKullaniciAdi;
    private Button buttonMailAt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sifre_unutma);

        etKullaniciAdi = findViewById(R.id.etKullaniciAdi);
        buttonMailAt = findViewById(R.id.buttonMailAt);

        buttonMailAt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SifreUnutmaActivity.this,AnaEkranActivity.class));
                finish();
            }
        });
    }
}
