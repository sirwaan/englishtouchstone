package com.sirwan.touchstone1;

import androidx.annotation.ColorInt;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;

import com.sirwan.touchstone1.Units.U1;
import com.sirwan.touchstone1.Units.U10;
import com.sirwan.touchstone1.Units.U2;
import com.sirwan.touchstone1.Units.U3;
import com.sirwan.touchstone1.Units.U4;
import com.sirwan.touchstone1.Units.U5;
import com.sirwan.touchstone1.Units.U6;
import com.sirwan.touchstone1.Units.U7;
import com.sirwan.touchstone1.Units.U8;
import com.sirwan.touchstone1.Units.U9;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    CardView u1, u2, u3, u4, u5, u6, u7, u8, u9, u10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (android.os.Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().setNavigationBarColor(ContextCompat.getColor(this, R.color.colorAccent));
        }

        u1 = findViewById(R.id.go_to_u1);
        u2 = findViewById(R.id.go_to_u2);
        u3 = findViewById(R.id.go_to_u3);
        u4 = findViewById(R.id.go_to_u4);
        u5 = findViewById(R.id.go_to_u5);
        u6 = findViewById(R.id.go_to_u6);
        u7 = findViewById(R.id.go_to_u7);
        u8 = findViewById(R.id.go_to_u8);
        u9 = findViewById(R.id.go_to_u9);
        u10 = findViewById(R.id.go_to_u10);


        u1.setOnClickListener(this);
        u2.setOnClickListener(this);
        u3.setOnClickListener(this);
        u4.setOnClickListener(this);
        u5.setOnClickListener(this);
        u6.setOnClickListener(this);
        u7.setOnClickListener(this);
        u8.setOnClickListener(this);
        u9.setOnClickListener(this);
        u10.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        int id = v.getId();
        if (id == R.id.go_to_u1) {
            startActivity(new Intent(MainActivity.this, U1.class));

        } else if (id == R.id.go_to_u2) {
            startActivity(new Intent(MainActivity.this, U2.class));

        } else if (id == R.id.go_to_u3) {
            startActivity(new Intent(MainActivity.this, U3.class));
        } else if (id == R.id.go_to_u4) {
            startActivity(new Intent(MainActivity.this, U4.class));
        } else if (id == R.id.go_to_u5) {
            startActivity(new Intent(MainActivity.this, U5.class));
        } else if (id == R.id.go_to_u6) {
            startActivity(new Intent(MainActivity.this, U6.class));
        } else if (id == R.id.go_to_u7) {
            startActivity(new Intent(MainActivity.this, U7.class));
        } else if (id == R.id.go_to_u8) {
            startActivity(new Intent(MainActivity.this, U8.class));
        } else if (id == R.id.go_to_u9) {
            startActivity(new Intent(MainActivity.this, U9.class));
        } else if (id == R.id.go_to_u10) {
            startActivity(new Intent(MainActivity.this, U10.class));
        } else {
        }
    }
}
