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

import com.example.encore2019.sports_events.kabaddi;
import com.example.encore2019.sports_events.badminton;

import org.w3c.dom.Text;


public class sports_frag extends Fragment {
    public CardView badminton;
    public CardView futsal;
    public CardView carrom;
    public CardView taekwondo;
    public CardView table;
    public CardView chess;
    public CardView kabaddi;
    public TextView badminton1;
    public TextView futsal1;
    public TextView carrom1;
    public TextView taekwondo1;
    public TextView table1;
    public TextView chess1;
    public TextView kabaddi1;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_sports_frag, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        getActivity().setTitle("SPORTS");


        badminton = (CardView) view.findViewById(R.id.Badminton_card);
        badminton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity= new Intent(getActivity(), com.example.encore2019.sports_events.badminton.class);
                startActivity(intentLoadNewActivity);
            }

        });
        badminton1 = (TextView) view.findViewById(R.id.Badminton);
        badminton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity= new Intent(getActivity(), com.example.encore2019.sports_events.badminton.class);
                startActivity(intentLoadNewActivity);
            }

        });
        chess = (CardView) view.findViewById(R.id.Chess_card);
        chess.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity= new Intent(getActivity(), com.example.encore2019.sports_events.chess.class);
                startActivity(intentLoadNewActivity);
            }

        });
        chess1 = (TextView) view.findViewById(R.id.Chess);
        chess1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity= new Intent(getActivity(), com.example.encore2019.sports_events.chess.class);
                startActivity(intentLoadNewActivity);
            }

        });
        futsal = (CardView) view.findViewById(R.id.futsal_card);
        futsal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity= new Intent(getActivity(), com.example.encore2019.sports_events.futsal.class);
                startActivity(intentLoadNewActivity);
            }

        });
        futsal1 = (TextView) view.findViewById(R.id.futsal);
        futsal1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity= new Intent(getActivity(), com.example.encore2019.sports_events.futsal.class);
                startActivity(intentLoadNewActivity);
            }

        });
        carrom = (CardView) view.findViewById(R.id.Carrom_card);
        carrom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity= new Intent(getActivity(), com.example.encore2019.sports_events.carrom.class);
                startActivity(intentLoadNewActivity);
            }

        });
        carrom1 = (TextView) view.findViewById(R.id.carrom);
        carrom1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity= new Intent(getActivity(), com.example.encore2019.sports_events.carrom.class);
                startActivity(intentLoadNewActivity);
            }

        });
        taekwondo = (CardView) view.findViewById(R.id.Taekwondo_card);
        taekwondo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity= new Intent(getActivity(), com.example.encore2019.sports_events.taekwondo.class);
                startActivity(intentLoadNewActivity);
            }

        });
        taekwondo1 = (TextView) view.findViewById(R.id.Taekwondo);
        taekwondo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity= new Intent(getActivity(), com.example.encore2019.sports_events.taekwondo.class);
                startActivity(intentLoadNewActivity);
            }

        });

        table = (CardView) view.findViewById(R.id.Table_card);
        table.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity= new Intent(getActivity(), com.example.encore2019.sports_events.table.class);
                startActivity(intentLoadNewActivity);
            }

        });
        table1 = (TextView) view.findViewById(R.id.table);
        table1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity= new Intent(getActivity(), com.example.encore2019.sports_events.table.class);
                startActivity(intentLoadNewActivity);
            }

        });

        kabaddi = (CardView) view.findViewById(R.id.kabaddi_card);
        kabaddi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity= new Intent(getActivity(), com.example.encore2019.sports_events.kabaddi.class);
                startActivity(intentLoadNewActivity);
            }
        });
        kabaddi1 = (TextView) view.findViewById(R.id.kabaddi);
        kabaddi1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity= new Intent(getActivity(), com.example.encore2019.sports_events.kabaddi.class);
                startActivity(intentLoadNewActivity);
            }
        });

    }
}
