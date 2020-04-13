package com.mbobysetiawan.aplikasitokobuku.users;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.mbobysetiawan.aplikasitokobuku.R;
import com.ornach.nobobutton.NoboButton;

public class DaftarActivity extends AppCompatActivity {

    NoboButton btndaftar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar);

        getSupportActionBar().hide();

        btndaftar = (NoboButton) findViewById(R.id.btndaftar);

        btndaftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(DaftarActivity.this, LoginActivity.class);
                startActivity(i);
                finish();
            }
        });

    }
}
