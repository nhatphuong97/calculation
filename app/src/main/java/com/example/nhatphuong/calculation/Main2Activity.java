package com.example.nhatphuong.calculation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

public class Main2Activity extends AppCompatActivity implements OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    int[] idButton ={R.id.button0,R.id.button1,R.id.button2,R.id.button3,R.id.button4,R.id.button5,R.id.button6,R.id.button7,R.id.button8,R.id.button9,R.id.button_cong,R.id.button_tru,R.id.button_nhan};
    for(int id:idButton){
        View v =findViewById(id);
        v.setOnClickListener(this);

    }

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button1:



        }
    }

}
