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

import iet.lucknow.encore2019.arts_and_literary_events.clay;


public class arts_frag extends Fragment {

    public CardView debate;
    public CardView dress;
    public CardView lacuzzi;
    public CardView poetry;
    public CardView talk;
    public CardView tattoo;
    public CardView live;
    public CardView blind;
    public CardView poster;
    public TextView debate1;
    public TextView dress1;
    public TextView lacuzzi1;
    public TextView poetry1;
    public TextView talk1;
    public TextView tattoo1;
    public TextView live1;
    public TextView blind1;
    public TextView poster1;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_arts_frag, container, false);
        
        
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        getActivity().setTitle("ARTS AND LITERARY");


        debate = view.findViewById(R.id.debate_card);
        debate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity= new Intent(getActivity(), iet.lucknow.encore2019.arts_and_literary_events.debate.class);
                startActivity(intentLoadNewActivity);
            }

        });
        debate1 = view.findViewById(R.id.debate);
        debate1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity= new Intent(getActivity(), iet.lucknow.encore2019.arts_and_literary_events.debate.class);
                startActivity(intentLoadNewActivity);
            }

        });
        dress1 = view.findViewById(R.id.dress);
        dress1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity= new Intent(getActivity(), iet.lucknow.encore2019.arts_and_literary_events.dress.class);
                startActivity(intentLoadNewActivity);
            }
        });
        dress = view.findViewById(R.id.dress_card);
        dress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity= new Intent(getActivity(), iet.lucknow.encore2019.arts_and_literary_events.dress.class);
                startActivity(intentLoadNewActivity);
            }
        });
        lacuzzi1 = view.findViewById(R.id.lacuzzi);
        lacuzzi1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity= new Intent(getActivity(), iet.lucknow.encore2019.arts_and_literary_events.lacuzzi.class);
                startActivity(intentLoadNewActivity);
            }
        });
        lacuzzi = view.findViewById(R.id.lacuzzi_card);
        lacuzzi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity= new Intent(getActivity(), iet.lucknow.encore2019.arts_and_literary_events.lacuzzi.class);
                startActivity(intentLoadNewActivity);
            }
        });
        live1 = view.findViewById(R.id.live);
        live1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity= new Intent(getActivity(), iet.lucknow.encore2019.arts_and_literary_events.live.class);
                startActivity(intentLoadNewActivity);
            }
        });
        live = view.findViewById(R.id.live_card);
        live.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity= new Intent(getActivity(), iet.lucknow.encore2019.arts_and_literary_events.live.class);
                startActivity(intentLoadNewActivity);
            }
        });
        poetry = view.findViewById(R.id.poetry_card);
        poetry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity= new Intent(getActivity(), iet.lucknow.encore2019.arts_and_literary_events.poetry.class);
                startActivity(intentLoadNewActivity);
            }
        });
        poetry1 = view.findViewById(R.id.poetry);
        poetry1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity= new Intent(getActivity(), iet.lucknow.encore2019.arts_and_literary_events.poetry.class);
                startActivity(intentLoadNewActivity);
            }
        });

        talk = view.findViewById(R.id.talk_card);
        talk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity= new Intent(getActivity(), iet.lucknow.encore2019.arts_and_literary_events.talk.class);
                startActivity(intentLoadNewActivity);
            }
        });

        talk1 = view.findViewById(R.id.talk);
        talk1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity= new Intent(getActivity(), iet.lucknow.encore2019.arts_and_literary_events.talk.class);
                startActivity(intentLoadNewActivity);
            }
        });
        tattoo = view.findViewById(R.id.tattoo_card);
        tattoo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity= new Intent(getActivity(), iet.lucknow.encore2019.arts_and_literary_events.tattoo.class);
                startActivity(intentLoadNewActivity);
            }
        });
        tattoo1 = view.findViewById(R.id.tattoo);
        tattoo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity= new Intent(getActivity(), iet.lucknow.encore2019.arts_and_literary_events.tattoo.class);
                startActivity(intentLoadNewActivity);
            }
        });
        blind = view.findViewById(R.id.blind_card);
        blind.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity= new Intent(getActivity(), iet.lucknow.encore2019.arts_and_literary_events.blind.class);
                startActivity(intentLoadNewActivity);
            }
        });
        blind1 = view.findViewById(R.id.blind);
        blind1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity= new Intent(getActivity(), iet.lucknow.encore2019.arts_and_literary_events.blind.class);
                startActivity(intentLoadNewActivity);
            }
        });
        poster = view.findViewById(R.id.poster_card);
        poster.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity= new Intent(getActivity(), clay.class);
                startActivity(intentLoadNewActivity);
            }
        });
        poster1 = view.findViewById(R.id.poster);
        poster1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity= new Intent(getActivity(), clay.class);
                startActivity(intentLoadNewActivity);
            }
        });
    }
}
