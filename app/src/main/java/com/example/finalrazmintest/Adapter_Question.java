package com.example.finalrazmintest;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;

import java.util.ArrayList;
import java.util.List;

public class Adapter_Question extends RecyclerView.Adapter<Adapter_Question.MyViewHolder>  {
private List<Question>myfriends;
    int a=0;
    int b=0;
    int c=0;
    int d=0;
    int e=0;
    int f=0;

    public Adapter_Question(List<Question> myfriends){
        this.myfriends=(myfriends==null)?
                new ArrayList<Question>():myfriends;



    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
      View itemView=  LayoutInflater.from(parent.getContext()).inflate(R.layout.question_layout,parent,false);



      return new MyViewHolder(itemView);
    }




    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
holder.bind(myfriends.get(position));
    }

    @Override
    public int getItemCount() {//...........تعداد عناصر لیست...............
        return myfriends.size();
    }





    public  class  MyViewHolder extends RecyclerView.ViewHolder  {
CheckBox checkBox;
    MyViewHolder(View itemView){

        super(itemView);

      checkBox=itemView.findViewById(R.id.checkBox);

    }
public  void bind(final Question myfriend){
        checkBox.setText(myfriend.getQestion());

checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean val) {
        if (myfriend.getQuestioncode().equals("a")){
          if(checkBox.isChecked()) {     a=a+1;}
          else{ a=a-1  ;  }
      }
        if (myfriend.getQuestioncode().equals("b")){
            if(checkBox.isChecked()) {     b=b+1;}
            else{ b=b-1  ;  }
        }
        if (myfriend.getQuestioncode().equals("c")){
            if(checkBox.isChecked()) {     c=c+1;}
            else{ c=c-1  ;  }
        }
        if (myfriend.getQuestioncode().equals("d")){
            if(checkBox.isChecked()) {     d=d+1;}
            else{ d=d-1  ;  }
        }
        if (myfriend.getQuestioncode().equals("e")){
            if(checkBox.isChecked()) {     e=e+1;}
            else{ e=e-1  ;  }
        }
        if (myfriend.getQuestioncode().equals("f")){
            if(checkBox.isChecked()) {     f=f+1;}
            else{ f=f-1  ;  }
        }

    }
});

}


    }
    public  int a(){
        return a;
    }
    public  int b(){
        return b;
    }
    public  int c(){
        return c;
    }
    public  int d(){
        return d;
    }
    public  int e(){
        return e;
    }
    public  int f(){
        return f;
    }

}
