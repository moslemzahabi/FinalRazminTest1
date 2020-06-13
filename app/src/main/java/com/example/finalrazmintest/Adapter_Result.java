package com.example.finalrazmintest;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Adapter_Result extends RecyclerView.Adapter<Adapter_Result.MyViewHolder> {
    private List<Answers> answerList;


    public Adapter_Result(List<Answers> myfriends) {
        this.answerList = (myfriends == null) ?
                new ArrayList<Answers>() : myfriends;


    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.manager_result, parent, false);


        return new MyViewHolder(itemView);
    }


    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.bind(answerList.get(position));
    }

    @Override
    public int getItemCount() {//...........تعداد عناصر لیست...............
        return answerList.size();
    }


    public class MyViewHolder extends RecyclerView.ViewHolder {
       TextView tv_name,tv_lastname,tv_id,tv_score;
       Button bt;

        MyViewHolder(View itemView) {

            super(itemView);

           tv_name    =itemView.findViewById(R.id.nameid    );
           tv_lastname=itemView.findViewById(R.id.lastnameid);
           tv_id      =itemView.findViewById(R.id.id_tx    );
           tv_score   =itemView.findViewById(R.id.scoreid      );
           bt         =itemView.findViewById(R.id.delete);

        }

          public void bind(final Answers answerLists) {
          tv_name    .setText(answerLists.getName()    );
          tv_lastname.setText(answerLists.getLastname());
          tv_id      .setText(answerLists.getID());
         tv_score   .setText(answerLists.getScore()   );

bt.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        myDatabaseHelper mydb = new myDatabaseHelper(itemView.getContext());
        mydb.deleteData(answerLists.getID());
        view.setBackgroundColor(0xFF868181);
    }
});

        }

    }
}