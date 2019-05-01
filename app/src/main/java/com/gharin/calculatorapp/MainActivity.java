package com.gharin.calculatorapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText nilai1 , nilai2;
    TextView hasil3;
    Button tambah , kurang , kali , bagi , hapus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
            //todo 7 inisialisasi operator
        //EditText
        nilai1 = findViewById(R.id.nilai1);
        nilai2 = findViewById(R.id.nilai2);

        //TextView
        hasil3 = findViewById(R.id.hasil3);

        //Button
        tambah = findViewById(R.id.tambah);
        kurang = findViewById(R.id.kurang);
        kali   = findViewById(R.id.kali);
        bagi   = findViewById(R.id.bagi);
        hapus  = findViewById(R.id.hapus);

     //todo 1 atur button untuk masing masing untuk operator
        tambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (nilai1.getText().toString().isEmpty() || nilai2.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this, "tidak boleh kosong, tolong di isi semua", Toast.LENGTH_SHORT).show();
                }else  {
                    tambah();
                }
            }
        });
        kurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (nilai1.getText().toString().isEmpty() || nilai2.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this, "tidak boleh kosong, tolong di isi semua", Toast.LENGTH_SHORT).show();
                }else  {
                    kurang();
                }
            }
        });
        kali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (nilai1.getText().toString().isEmpty() || nilai2.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this, "tidak boleh kosong, tolong di isi semua", Toast.LENGTH_SHORT).show();
                }else  {
                    kali();
                }
            }
        });
        bagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (nilai1.getText().toString().isEmpty() || nilai2.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this, "tidak boleh kosong, tolong di isi semua", Toast.LENGTH_SHORT).show();
                }else  {
                    bagi();
                }
            }
        });
        hapus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hapus();
            }
        });

    }
    //todo 2 void tambah
    void tambah(){
        int angka1 = Integer.parseInt(nilai1.getText().toString());
        int angka2 = Integer.parseInt(nilai2.getText().toString());

        int total = angka1 + angka2;
        hasil3.setText(String.valueOf(total));
    }
    //todo 3 void kurang
    void kurang(){
        int angka1 = Integer.parseInt(nilai1.getText().toString());
        int angka2 = Integer.parseInt(nilai2.getText().toString());

        int total = angka1 - angka2;
        hasil3.setText(String.valueOf(total));
    }
    //todo 4 void kali
    void kali(){
        int angka1 = Integer.parseInt(nilai1.getText().toString());
        int angka2 = Integer.parseInt(nilai2.getText().toString());

        int total = angka1 * angka2;
        hasil3.setText(String.valueOf(total));
    }
    //todo 5 void bagi
    void bagi(){
        int angka1 = Integer.parseInt(nilai1.getText().toString());
        int angka2 = Integer.parseInt(nilai2.getText().toString());

        int total = angka1 / angka2;
        hasil3.setText(String.valueOf(total));
    }
    //todo 6 void hapus
    void hapus(){
        nilai1.setText("");
        nilai2.setText("");
    }
}
