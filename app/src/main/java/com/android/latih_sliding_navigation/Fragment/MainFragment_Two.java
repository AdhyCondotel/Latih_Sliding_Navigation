package com.android.latih_sliding_navigation.Fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.android.latih_sliding_navigation.R;

public class MainFragment_Two extends Fragment {

        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
            ViewGroup grup = (ViewGroup) inflater.inflate(R.layout.activity_main_fragment_one,null);

            TextView txt = (TextView) grup.findViewById(R.id.textView);
            txt.setText("Sliding Two");
            return grup;


    }
}
