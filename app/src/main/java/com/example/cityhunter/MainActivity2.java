package com.example.cityhunter;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity2 extends AppCompatActivity {
    ImageView i1,i2,i3,i4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        i1=(ImageView)findViewById(R.id.imageview1);
        i2=(ImageView)findViewById(R.id.imageview2);
        i3=(ImageView)findViewById(R.id.imageview3);
        i4=(ImageView)findViewById(R.id.imageview4);


        i1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity2.this,Reastaurant.class);
                startActivity(intent);

            }
        });

        i2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity2.this,hospital.class);
                startActivity(intent);

            }
        });

        i3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity2.this,mall.class);
                startActivity(intent);
            }
        });

        i4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



                Intent intent=new Intent(MainActivity2.this,hotel.class);
                startActivity(intent);
            }
        });




    }
}