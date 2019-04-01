package com.example.encore2019;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;



public class cultural_frag extends Fragment {
    public CardView dance;
    public CardView skit;
    public CardView bike;
    public CardView nukkad;
    public CardView sing;
    public CardView final_year;
    public CardView vogue;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_cultural_frag, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        getActivity().setTitle("CULTURAL");

        dance = (CardView) view.findViewById(R.id.dance_card);
        dance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity= new Intent(getActivity(), com.example.encore2019.cultural_events.dance.class);
                startActivity(intentLoadNewActivity);
            }

        });
        skit = (CardView) view.findViewById(R.id.skit_card);
        skit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity= new Intent(getActivity(), com.example.encore2019.cultural_events.skit.class);
                startActivity(intentLoadNewActivity);
            }
        });
        bike = (CardView) view.findViewById(R.id.bike_card);
        bike.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity= new Intent(getActivity(), com.example.encore2019.cultural_events.torque.class);
                startActivity(intentLoadNewActivity);
            }
        });
        vogue = (CardView) view.findViewById(R.id.vogue_card);
        vogue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity= new Intent(getActivity(), com.example.encore2019.cultural_events.vogue.class);
                startActivity(intentLoadNewActivity);
            }
        });
        nukkad = (CardView) view.findViewById(R.id.nukkad_card);
        nukkad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity= new Intent(getActivity(), com.example.encore2019.cultural_events.nukkad.class);
                startActivity(intentLoadNewActivity);
            }
        });

        sing = (CardView) view.findViewById(R.id.sing_card);
        sing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity= new Intent(getActivity(), com.example.encore2019.cultural_events.sing.class);
                startActivity(intentLoadNewActivity);
            }
        });
    }
}
