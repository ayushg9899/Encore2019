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


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link technical_frag.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link technical_frag#newInstance} factory method to
 * create an instance of this fragment.
 */
public class technical_frag extends Fragment {

    public CardView code;
    public CardView hunt;
    public CardView roborace;
    public CardView robosumo;
    public CardView tech;
    public CardView robosoc;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_technical_frag, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        getActivity().setTitle("TECHNICAL");

        code = (CardView) view.findViewById(R.id.code_card);
        code.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity= new Intent(getActivity(), com.example.encore2019.technical_events.code.class);
                startActivity(intentLoadNewActivity);
            }

        });
        hunt = (CardView) view.findViewById(R.id.hunt_card);
        hunt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity= new Intent(getActivity(), com.example.encore2019.technical_events.hunt.class);
                startActivity(intentLoadNewActivity);
            }

        });
        robosoc = (CardView) view.findViewById(R.id.robosoc_card);
        robosoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity= new Intent(getActivity(), com.example.encore2019.technical_events.robosoc.class);
                startActivity(intentLoadNewActivity);
            }

        });
        roborace = (CardView) view.findViewById(R.id.roborace_card);
        roborace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity= new Intent(getActivity(), com.example.encore2019.technical_events.roborace.class);
                startActivity(intentLoadNewActivity);
            }

        });
        tech = (CardView) view.findViewById(R.id.Tech_card);
        tech.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity= new Intent(getActivity(), com.example.encore2019.technical_events.tech.class);
                startActivity(intentLoadNewActivity);
            }

        });
        robosumo = (CardView) view.findViewById(R.id.robosumo_card);
        robosumo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity= new Intent(getActivity(), com.example.encore2019.technical_events.robosumo.class);
                startActivity(intentLoadNewActivity);
            }

        });
    }
}
