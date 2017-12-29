package com.logischtech.kindergarten;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Subjects0 extends AppCompatActivity {

    ImageView btneng,btnhindi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subjects0);

        btneng = (ImageView)findViewById(R.id.btneng0);
        btnhindi = (ImageView)findViewById(R.id.btnhindi0);
        btneng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(Subjects0.this,English1.class);
                startActivity(in);

            }
        });
        btnhindi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inh = new Intent(Subjects0.this,Hindi1.class);
                startActivity(inh);

            }
        });



    }
}
