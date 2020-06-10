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
import android.widget.CheckBox;

import java.util.ArrayList;
import java.util.List;

public class QuestionTwo extends Fragment
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
                R.layout.qestion_one, container, false);



        return rootView;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);



        recyclerView  =view.findViewById(R.id.recyclerView  );





        Button form=view.findViewById(R.id.form);
        Button page2=view.findViewById(R.id.page4);



        list=new ArrayList<>();
        list.add(new Qestion("meysam","a"));
        list.add(new Qestion("meysam","a"));


        adapter=new MyAdapter(list);
        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));
        recyclerView.setAdapter(adapter);




        form.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SM.pages(0);
            }
        });
        page2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SM.data(1,"","",A,B);
                SM.pages(2); }});








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
