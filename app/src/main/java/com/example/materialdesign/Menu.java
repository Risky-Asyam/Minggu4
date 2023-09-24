package com.example.materialdesign;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;

public class Menu extends AppCompatActivity {

    Context ctx = this;
    private LinearLayout btn_constraint, btn_framelayout, btn_linearlayout, btn_relativelayout,
            btn_materialdesign, btn_scrollview, btn_scrollviewhorizontal, btn_tabellayout,
            btn_list, btn_recycleview, btn_fragment, btn_impintent, btn_expintent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        btn_constraint = findViewById(R.id.btn_constraint);
        btn_constraint.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(ctx, ConstraintLayout.class);
                startActivity(intent);
            }
        });

        btn_framelayout = findViewById(R.id.btn_framelayout);
        btn_framelayout.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(ctx, FrameLayout.class);
                startActivity(intent);
            }
        });

        btn_linearlayout = findViewById(R.id.btn_linearlayout);
        btn_linearlayout.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(ctx, TugasLinear.class);
                startActivity(intent);
            }
        });

        btn_relativelayout = findViewById(R.id.btn_relativelayout);
        btn_relativelayout.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(ctx, RelativeLayout.class);
                startActivity(intent);
            }
        });

        btn_materialdesign = findViewById(R.id.btn_materialdesign);
        btn_materialdesign.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(ctx, MaterialDesign.class);
                startActivity(intent);
            }
        });

        btn_scrollview = findViewById(R.id.btn_scrollview);
        btn_scrollview.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(ctx, ScrollView.class);
                startActivity(intent);
            }
        });

        btn_scrollviewhorizontal = findViewById(R.id.btn_scrollviewhorizontal);
        btn_scrollviewhorizontal.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(ctx, ScrollViewHorizontal.class);
                startActivity(intent);
            }
        });

        btn_tabellayout = findViewById(R.id.btn_tabellayout);
        btn_tabellayout.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(ctx, TabelLayout.class);
                startActivity(intent);
            }
        });

        btn_list = findViewById(R.id.btn_list);
        btn_list.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(ctx, list_item.class);
                startActivity(intent);
            }
        });

        btn_recycleview = findViewById(R.id.btn_recycleview);
        btn_recycleview.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(ctx, recycle.class);
                startActivity(intent);
            }
        });

        btn_fragment = findViewById(R.id.btn_fragment);
        btn_fragment.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(ctx, Fragment_Example.class);
                startActivity(intent);
            }
        });

        btn_impintent = findViewById(R.id.btn_impintent);
        btn_impintent.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(ctx, ImpIntentApp.class);
                startActivity(intent);
            }
        });

        btn_expintent = findViewById(R.id.btn_expintent);
        btn_expintent.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(ctx, ExpIntent.class);
                startActivity(intent);
            }
        });

    }
}