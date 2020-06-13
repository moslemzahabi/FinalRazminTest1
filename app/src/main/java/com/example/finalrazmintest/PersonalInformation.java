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
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;

public class PersonalInformation extends Fragment
{



SendMessage SM;





  EditText name,lastname;





    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(
                R.layout.personal_information, container, false);



        return rootView;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);



        name      =view.findViewById(R.id.et_nameid    );
        lastname  =view.findViewById(R.id.et_lastnameid);




        Button previus =view.findViewById(R.id.previus);
        Button next    =view.findViewById(R.id.next   );










        previus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SM.pages(-2);
            }
        });
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                SM.data(0,name.getText().toString(),lastname.getText().toString(),0,0,0,0,0,0);
SM.pages(1); }});








    }








    interface SendMessage {
        void pages(int Pag_number);
        void data(int pag, String name, String lastname, int A, int B, int C, int D, int E, int F);
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


