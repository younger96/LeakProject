package com.example.a47420.leakproject;

import android.support.v4.app.Fragment;

import com.squareup.leakcanary.RefWatcher;

public class LeakFragment  extends Fragment {


    @Override
    public void onDestroy() {
        super.onDestroy();
        RefWatcher refWatcher = LeakApp.getRefWatcher(getActivity().getApplicationContext());
        refWatcher.watch(this);
    }
}
