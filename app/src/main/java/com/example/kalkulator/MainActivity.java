package com.example.kalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btnHasil, btnLuask, btnLuast, btnLuasl;
    private TextView vHasil, vLuask, vLuast, vLuasl;
    private EditText etPanjang, etLebar, etTinggi, etJari, etTtinggi, etPalas, etLalas, etTalas, kSisi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnHasil = findViewById(R.id.btn_hasil);
        btnLuask = findViewById(R.id.btn_luask);
        btnLuast = findViewById(R.id.btn_luast);
        btnLuasl = findViewById(R.id.btn_luasl);

        vHasil = findViewById(R.id.v_hasil);
        vLuask = findViewById(R.id.v_luask);
        vLuast = findViewById(R.id.v_luast);
        vLuasl = findViewById(R.id.v_luasl);

        etPanjang = findViewById(R.id.et_panjang);
        etLebar = findViewById(R.id.et_lebar);
        etTinggi = findViewById(R.id.et_tinggi);

        kSisi = findViewById(R.id.k_sisi);

        etJari = findViewById(R.id.et_jari);
        etTtinggi = findViewById(R.id.et_ttinggi);

        etPalas = findViewById(R.id.et_palas);
        etLalas = findViewById(R.id.et_lalas);
        etTalas = findViewById(R.id.et_talas);



        btnHasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sPanjang = etPanjang.getText().toString();
                String sLebar = etLebar.getText().toString();
                String sTinggi = etTinggi.getText().toString();

                double panjang = Double.parseDouble(sPanjang);
                double lebar = Double.parseDouble(sLebar);
                double tinggi = Double.parseDouble(sTinggi);

                double hasil = panjang*lebar*tinggi;

                String sHasil = String.valueOf(hasil);
                vHasil.setText(sHasil);
            }

        });

        btnLuask.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                try {
                    String sSisi = kSisi.getText().toString();

                    double sisi = Double.parseDouble(sSisi);

                    double luask = sisi * sisi * sisi;

                    String sLuask = String.valueOf(luask);
                    vLuask.setText(sLuask);
                }catch(NumberFormatException nfe) {
                    Toast.makeText(getApplicationContext(), "Field Tidak Boleh kosong", Toast.LENGTH_SHORT).show();
                }

            }
        });

        btnLuast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sJari = etJari.getText().toString();
                String sTtinggi = etTtinggi.getText().toString();

                double jari = Double.parseDouble(sJari);
                double ttinggi=  Double.parseDouble(sTtinggi);
                double luast = 3.14 * jari * jari * ttinggi;

                String sLuast = String.valueOf(luast);
                vLuast.setText(sLuast);
            }
        });

        btnLuasl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String sPalas = etPalas.getText().toString();
                    String sLalas = etLalas.getText().toString();
                    String sTalas = etTalas.getText().toString();

                    double alasp = Double.parseDouble(sPalas);
                    double alasl = Double.parseDouble(sLalas);
                    double tinggil = Double.parseDouble(sTalas);
                    double luasl = (alasp * alasl * tinggil) / 3;

                    String sLuasl = String.valueOf(luasl);
                    vLuasl.setText(sLuasl);
                }catch(NumberFormatException nfe) {
                    Toast.makeText(getApplicationContext(), "Field Tidak Boleh kosong", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

}