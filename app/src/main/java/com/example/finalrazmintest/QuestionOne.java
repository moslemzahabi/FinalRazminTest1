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

public class QuestionOne extends Fragment
{



SendMessage SM;


    List<Question> list;

    RecyclerView recyclerView;
    Adapter_Question adapter;
    int A=0;
    int B=0;
    int C=0;
    int D=0;
    int E=0;
    int F=0;




    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(
                R.layout.qestion_one, container, false);



        return rootView;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);



        recyclerView  =view.findViewById(R.id.recyclerView  );





        Button previus =view.findViewById(R.id.previus);
        Button next    =view.findViewById(R.id.next   );



        list=new ArrayList<>();
        list.add(new Question("a","a"));
        list.add(new Question("b","b"));
        list.add(new Question("c","c"));
        list.add(new Question("d","d"));
        list.add(new Question("e","e"));
        list.add(new Question("f","f"));


        adapter=new Adapter_Question(list);
        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));
        recyclerView.setAdapter(adapter);




        previus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SM.pages(-2);
            }
        });
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                A=adapter.a();
                B=adapter.b();
                C=adapter.c();
                D=adapter.b();
                E=adapter.e();
                F=adapter.f();
                SM.data(1,"","",A,B,C,D,E,F);
SM.pages(2); }});








    }








    interface SendMessage {
        void pages(int Pag_number);
        void data(int pag, String name, String lastname, int A, int B,int C,int D,int E,int F);
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


