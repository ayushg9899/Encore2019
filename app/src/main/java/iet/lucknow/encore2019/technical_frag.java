package iet.lucknow.encore2019;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import iet.lucknow.encore2019.R;

import iet.lucknow.encore2019.informal_events.pubg;


public class technical_frag extends Fragment {

    public CardView code;
    public CardView hunt;
    public CardView roborace;
    public CardView robosumo;
    public CardView tech;
    public CardView robosoc;
    public CardView aero;
    public TextView code1;
    public TextView hunt1;
    public TextView roborace1;
    public TextView robosumo1;
    public TextView tech1;
    public TextView robosoc1;
    public TextView aero1;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_technical_frag, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        getActivity().setTitle("TECHNICAL");

        code = view.findViewById(R.id.code_card);
        code.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity= new Intent(getActivity(), iet.lucknow.encore2019.technical_events.code.class);
                startActivity(intentLoadNewActivity);
            }

        });
        code1 = view.findViewById(R.id.code);
        code1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity= new Intent(getActivity(), iet.lucknow.encore2019.technical_events.code.class);
                startActivity(intentLoadNewActivity);
            }

        });
        hunt = view.findViewById(R.id.hunt_card);
        hunt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity= new Intent(getActivity(), iet.lucknow.encore2019.technical_events.hunt.class);
                startActivity(intentLoadNewActivity);
            }

        });
        hunt1 = view.findViewById(R.id.hunt);
        hunt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity= new Intent(getActivity(), iet.lucknow.encore2019.technical_events.hunt.class);
                startActivity(intentLoadNewActivity);
            }

        });
        robosoc = view.findViewById(R.id.robosoc_card);
        robosoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity= new Intent(getActivity(), iet.lucknow.encore2019.technical_events.robosoc.class);
                startActivity(intentLoadNewActivity);
            }

        });
        robosoc1 = view.findViewById(R.id.robosoc);
        robosoc1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity= new Intent(getActivity(), iet.lucknow.encore2019.technical_events.robosoc.class);
                startActivity(intentLoadNewActivity);
            }

        });
        roborace1 = view.findViewById(R.id.roborace);
        roborace1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity= new Intent(getActivity(), pubg.class);
                startActivity(intentLoadNewActivity);
            }

        });
        roborace = view.findViewById(R.id.roborace_card);
        roborace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity= new Intent(getActivity(), pubg.class);
                startActivity(intentLoadNewActivity);
            }

        });
        tech = view.findViewById(R.id.Tech_card);
        tech.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity= new Intent(getActivity(), iet.lucknow.encore2019.technical_events.tech.class);
                startActivity(intentLoadNewActivity);
            }

        });
        tech1 = view.findViewById(R.id.Tech);
        tech1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity= new Intent(getActivity(), iet.lucknow.encore2019.technical_events.tech.class);
                startActivity(intentLoadNewActivity);
            }

        });
        robosumo = view.findViewById(R.id.robosumo_card);
        robosumo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity= new Intent(getActivity(), iet.lucknow.encore2019.technical_events.robosumo.class);
                startActivity(intentLoadNewActivity);
            }

        });
        robosumo1 = view.findViewById(R.id.robosumo);
        robosumo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity= new Intent(getActivity(), iet.lucknow.encore2019.technical_events.robosumo.class);
                startActivity(intentLoadNewActivity);
            }

        });
        aero = view.findViewById(R.id.aero_card);
        aero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity= new Intent(getActivity(), iet.lucknow.encore2019.technical_events.aero.class);
                startActivity(intentLoadNewActivity);
            }

        });
        aero1 = view.findViewById(R.id.aero);
        aero1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity= new Intent(getActivity(), iet.lucknow.encore2019.technical_events.aero.class);
                startActivity(intentLoadNewActivity);
            }

        });
    }
}
