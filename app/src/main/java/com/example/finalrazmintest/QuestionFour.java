package com.example.finalrazmintest;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class QuestionFour extends Fragment
{



SendMessage SM;


    List<Qestion> list;

    RecyclerView recyclerView;
    MyAdapter adapter;
    int A=0;
    int B=0;





    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(
                R.layout.qestion_four, container, false);



        return rootView;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);



        recyclerView  =view.findViewById(R.id.recyclerView  );





        Button previus =view.findViewById(R.id.previus);
        Button next    =view.findViewById(R.id.next   );



        list=new ArrayList<>();
        list.add(new Qestion("maman","a"));
        list.add(new Qestion("maman","a"));

        adapter=new MyAdapter(list);
        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));
        recyclerView.setAdapter(adapter);




        previus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SM.pages(3);
            }
        });
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//SM.data(1,"","",A,B);
SM.pages(3); }});








    }








    interface SendMessage {
        void pages(int Pag_number);
void data(int pag, String name, String lastname, int A, int B);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        try {
            SM = (SendMessage) getActivity();
        } catch (ClassCastException e) {

        }
    }




    }

