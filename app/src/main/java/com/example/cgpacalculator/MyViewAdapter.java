package com.example.cgpacalculator;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.cgpacalculator.fragment.BlankFragment;
import com.example.cgpacalculator.fragment.BlankFragment2;

public class MyViewAdapter extends FragmentStateAdapter {
    public MyViewAdapter(@NonNull MainActivity3 fragment) {
        super(fragment);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0:
                return new BlankFragment();
            case 1 :
                return  new BlankFragment2();
            default:
                return  new BlankFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}
