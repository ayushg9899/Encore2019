package com.example.encore2019;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class schedule_fagment extends Fragment {
private TextView textView;

    public schedule_fagment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_schedule_fagment, container, false);
        textView = view.findViewById(R.id.txt_display);
        textView.setText(getArguments().getString("message"));
        return view;

    }

}
