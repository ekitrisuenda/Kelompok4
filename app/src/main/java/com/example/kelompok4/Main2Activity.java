package com.example.kelompok4;

import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        FragmentManager mFragmentManager = getSupportFragmentManager();
        FragmentTransaction mFragmentTransaction = mFragmentManager.beginTransaction();
        BtnFavoriteFragment mHomeFragment = new BtnFavoriteFragment();
        mFragmentTransaction.add(R.id.frame_container, mHomeFragment, BtnFavoriteFragment.class.getSimpleName());

        Log.d("MyFlexibleFragment", "Fragment Name :" + BtnFavoriteFragment.class.getSimpleName());
        mFragmentTransaction.commit();
    }

    public void home(View view) {
        Intent home = new Intent(Main2Activity.this, MainActivity.class);
        startActivity(home);
        finish();
    }



}
