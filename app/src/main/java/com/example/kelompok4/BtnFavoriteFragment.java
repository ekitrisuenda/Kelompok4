package com.example.kelompok4;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;


public class BtnFavoriteFragment extends Fragment implements View.OnClickListener {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_btn_favorite, container, false);
        ImageButton btnInfo = (ImageButton) view.findViewById(R.id.btn_info);
        btnInfo.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        if (v.getId () == R.id.btn_info){
            IsiFavoriteFragment mInfoFragment = new IsiFavoriteFragment();
            FragmentManager mFragmentManager = getFragmentManager();
            FragmentTransaction mFragmentTransaction = mFragmentManager.beginTransaction();
            mFragmentTransaction.replace(R.id.frame_container, mInfoFragment, IsiFavoriteFragment.class.getSimpleName());
            mFragmentTransaction.addToBackStack(null);
            mFragmentTransaction.commit();

        }

    }

    


}
