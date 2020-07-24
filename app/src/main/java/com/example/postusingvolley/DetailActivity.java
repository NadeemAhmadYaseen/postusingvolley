package com.example.postusingvolley;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    TextView tvid,tvname,tvemail;
    int position;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);


        //Initializing Views
        tvid = findViewById(R.id.txtid);
        tvname = findViewById(R.id.txtname);
        tvemail = findViewById(R.id.txtemail);


        Intent intent =getIntent();
        position = intent.getExtras().getInt("position");
        tvid.setText("ID: "+MainActivity.postDetailArrayList.get(position).getId());
        tvname.setText("TITLE: "+MainActivity.postDetailArrayList.get(position).getTitle());
        tvemail.setText("Description: "+MainActivity.postDetailArrayList.get(position).getDescription());





    }
}
