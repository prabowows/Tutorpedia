package com.example.prabowo.tutorpedia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Tutor2 extends AppCompatActivity implements View.OnClickListener {

    private Button BTtutor2next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutor2);

        BTtutor2next = (Button) findViewById(R.id.BTtutor2next);
        BTtutor2next.setOnClickListener(this);

    }



    public void onClick(View v) {


        if(v == BTtutor2next){

        Intent intent = new Intent(this,Tutor3.class);
        startActivity(intent);
    }

        /*if(v == IVtransisimateri){

        Intent intent = new Intent(this,Materi.class);
        intent.putExtra("Matkul",Matkul);
        startActivity(intent);*/
    }

}
