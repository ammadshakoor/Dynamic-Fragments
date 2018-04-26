package com.example.administrator.dynamicfragment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private boolean checkCondition;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button button1 = (Button)findViewById(R.id.button1);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm = getFragmentManager();

                FragmentTransaction ft = fm.beginTransaction();

                ft.replace(R.id.fragmentplace, (checkCondition ? new FirstFragment() : new SecondFragment()));

                ft.commit();

                checkCondition = !checkCondition;
            }
        });


    }
}
