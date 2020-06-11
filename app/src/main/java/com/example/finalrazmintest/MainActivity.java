package com.example.finalrazmintest;



import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;



public class MainActivity extends AppCompatActivity implements QuestionOne.SendMessage , QuestionTwo.SendMessage,
        QuestionTree.SendMessage , QuestionFour.SendMessage{
FragmentManager fragmentManager;

    int     a1=0,a2=0,a3=0,a4=0
           ,b1=0,b2=0,b3=0,b4=0
           ,c1=0,c2=0,c3=0,c4=0
           ,d1=0,d2=0,d3=0,d4=0
           ,e1=0,e2=0,e3=0,e4=0
           ,f1=0,f2=0,f3=0,f4=0;





    String nname,llastname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        fragmentManager = getSupportFragmentManager();//Get Fragment Manager

        fragmentManager.beginTransaction().replace(R.id.framelayout, new QuestionOne()).commit();

    }

   @Override
    public void pages(int Pag_number) {
//        if(Pag_number==-2){
//            fragmentManager.beginTransaction().replace(R.id.framelayout,new ManagerFragment()).commit();
//        }
//        if(Pag_number==-1){
//            fragmentManager.beginTransaction().replace(R.id.framelayout,new IntrooFragment()).commit();
//        }
//        if(Pag_number==0){
//            fragmentManager.beginTransaction().replace(R.id.framelayout,new FragmentOne()).commit();
 //       }

        if(Pag_number==1){
            fragmentManager.beginTransaction().replace(R.id.framelayout,new QuestionOne()).commit();
        }

        if(Pag_number==2){
            fragmentManager.beginTransaction().replace(R.id.framelayout,new QuestionTwo()).commit();
        }
        if(Pag_number==3){
            fragmentManager.beginTransaction().replace(R.id.framelayout,new QuestionTree()).commit();
        }
        if(Pag_number==4){
            fragmentManager.beginTransaction().replace(R.id.framelayout,new QuestionFour()).commit();
        }
//        if(Pag_number==5){
//
//            String mes;
//
//            myDatabaseHelper mydb = new myDatabaseHelper(this);
//
//
//
//
//
////دادن متغیرها به ورودی تابع insertData
//            boolean x=
//                    mydb.insertData(nname,llastname,
//                            a1+a2+a3+a4,b1+b2+b3+b4,c1+c2+c3+c4,
//                            d1+d2+d3+d4,e1+e2+e3+e4,f1+f2+f3+f4 );
//
//
//            if(x==true)
//                mes="اطلاعات ذخیره شد";
//            else
//                mes="اطلاعات ذخیره نشد";
////نمایش پیغام
//            Toast.makeText(this,mes,Toast.LENGTH_LONG).show();
//            fragmentManager.beginTransaction().replace(R.id.framelayout,new IntrooFragment()).commit();
//
//        }

    }


    public void data(int pag, String name, String lastname, int A, int B,int C,int D,int E,int F) {





        if(pag==0){

           nname    =name;
           llastname=lastname;


        }
       if(pag==1){
            a1=A;
            b1=B;
            c1=C;
            d1=D;
            e1=E;
            f1=F;

             }
        if(pag==2){
            a2=A;
            b2=B;
            c2=C;
            d2=D;
            e2=E;
            f2=F;
        }
        if(pag==3){
            a3=A;
            b3=B;
            c3=C;
            d3=D;
            e3=E;
            f3=F;

        }
        if(pag==4){
            a4=A;
            b4=B;
            c4=C;
            d4=D;
            e4=E;
            f4=F;

        }




    }

    public void toast1(){


    Toast.makeText(this, "ejra shod", Toast.LENGTH_SHORT).show();

    }



}
