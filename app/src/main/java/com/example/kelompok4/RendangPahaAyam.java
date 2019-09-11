package com.example.kelompok4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class RendangPahaAyam extends AppCompatActivity{

    @BindView(R.id.input_kritik)
    EditText inputKritik;

    @BindView(R.id.simpan_button)
    Button simpan_button;

    @BindView(R.id.hasil_kritik)
    TextView hasilKritik;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rendang_paha_ayam);
        ButterKnife.bind(this);
    }


    @OnClick(R.id.simpan_button)
    public void btnClicked(){
        String kritik = inputKritik.getText().toString();
        hasilKritik.setText(kritik);
    }
}
