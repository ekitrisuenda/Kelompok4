package com.example.kelompok4;

import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager mFragmentManager = getSupportFragmentManager();
        FragmentTransaction mFragmentTransaction = mFragmentManager.beginTransaction();
        BtnFavoriteFragment mHomeFragment = new BtnFavoriteFragment();
        mFragmentTransaction.add(R.id.frame_container, mHomeFragment, BtnFavoriteFragment.class.getSimpleName());

        Log.d("MyFlexibleFragment", "Fragment Name :" + BtnFavoriteFragment.class.getSimpleName());
        mFragmentTransaction.commit();


    }



    public void rendang(View view) {
        Intent rendang = new Intent(MainActivity.this, RendangPahaAyam.class);
        startActivity(rendang);
    }

    public void cumisambal(View view) {
        Intent cumisambal = new Intent(MainActivity.this, CumiSambalHijau.class);
        startActivity(cumisambal);
    }

    public void capcay(View view) {
        Intent capcay = new Intent(MainActivity.this, CapcayGoreng.class);
        startActivity(capcay);
    }

    public void oseng(View view) {
        Intent oseng = new Intent(MainActivity.this, OsengKacangPanjang.class);
        startActivity(oseng);
    }

    public void cumipedas(View view) {
        Intent cumipedas = new Intent(MainActivity.this, CumiPedasManis.class);
        startActivity(cumipedas);
    }

    public void pesmol(View view) {
        Intent pesmol = new Intent(MainActivity.this, PesmolIkanNila.class);
        startActivity(pesmol);
    }

    public void kelompok(View view) {
        Intent kelompok = new Intent(MainActivity.this, Main2Activity.class);
        startActivity(kelompok);
    }

    public void home(View view) {
        Intent home = new Intent(MainActivity.this, MainActivity.class);
        startActivity(home);
        finish();
    }
}
