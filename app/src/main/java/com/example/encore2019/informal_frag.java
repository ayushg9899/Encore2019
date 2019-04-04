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
import android.widget.TextView;


public class informal_frag extends Fragment {

    public CardView laser;
    public CardView turn;
    public CardView zorb;
    public CardView light;
    public CardView pubg;
    public CardView quest;
    public TextView laser1;
    public TextView turn1;
    public TextView zorb1;
    public TextView light1;
    public TextView pubg1;
    public TextView quest1;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_informal_frag, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        getActivity().setTitle("INFORMAL");

        laser = (CardView) view.findViewById(R.id.laser_card);
        laser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity= new Intent(getActivity(), com.example.encore2019.informal_events.laser.class);
                startActivity(intentLoadNewActivity);
            }

        });
        laser1 = (TextView) view.findViewById(R.id.laser);
        laser1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity= new Intent(getActivity(), com.example.encore2019.informal_events.laser.class);
                startActivity(intentLoadNewActivity);
            }

        });
        turn = (CardView) view.findViewById(R.id.turn_card);
        turn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity= new Intent(getActivity(), com.example.encore2019.informal_events.turn.class);
                startActivity(intentLoadNewActivity);
            }
        });
        turn1 = (TextView) view.findViewById(R.id.turn);
        turn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity= new Intent(getActivity(), com.example.encore2019.informal_events.turn.class);
                startActivity(intentLoadNewActivity);
            }

        });
        zorb = (CardView) view.findViewById(R.id.zorb_card);
        zorb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity= new Intent(getActivity(), com.example.encore2019.informal_events.zorb.class);
                startActivity(intentLoadNewActivity);
            }
        });
        zorb1 = (TextView) view.findViewById(R.id.zorb_year);
        zorb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity= new Intent(getActivity(), com.example.encore2019.informal_events.zorb.class);
                startActivity(intentLoadNewActivity);
            }

        });
        quest = (CardView) view.findViewById(R.id.quest_card);
        quest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity= new Intent(getActivity(), com.example.encore2019.informal_events.quest.class);
                startActivity(intentLoadNewActivity);
            }
        });
        quest1 = (TextView) view.findViewById(R.id.quest);
        quest1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity= new Intent(getActivity(), com.example.encore2019.informal_events.quest.class);
                startActivity(intentLoadNewActivity);
            }

        });
//        light = (CardView) view.findViewById(R.id.light_card);
//        light.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intentLoadNewActivity= new Intent(getActivity(), com.example.encore2019.informal_events.light.class);
//                startActivity(intentLoadNewActivity);
//            }
//        });

        pubg = (CardView) view.findViewById(R.id.pubg_card);
        pubg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity= new Intent(getActivity(), com.example.encore2019.informal_events.pubg.class);
                startActivity(intentLoadNewActivity);
            }
        });
        pubg1 = (TextView) view.findViewById(R.id.pubg);
        pubg1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity= new Intent(getActivity(), com.example.encore2019.informal_events.pubg.class);
                startActivity(intentLoadNewActivity);
            }
        });

    }
}
