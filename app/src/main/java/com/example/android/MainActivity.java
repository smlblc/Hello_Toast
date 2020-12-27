package com.example.android;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int mCount = 0;
    private TextView mShowCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
mShowCount = (TextView) findViewById(R.id.show_count);
    }

    public void showToast(View view) {
        Toast toast = Toast.makeText(this, R.string.toast_message, Toast.LENGTH_SHORT);
        toast.show();
    }

    public void countUp(View view) {
        ++mCount;
        if(mShowCount!=null)
            mShowCount.setText(Integer.toString(mCount));

    }
}






/*
public class MainActivity extends AppCompatActivity {
    private int counter = 0;
    private Button increase;
    private Button reset;
    private TextView counterScreen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        increase = findViewById(R.id.button_count);
        reset = findViewById(R.id.button_toast);
        counterScreen = findViewById(R.id.show_count);


        increase.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                counter++;
                counterScreen.setText(String.valueOf(counter));
            }
        });

        reset.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if(counter>0){
                    counter--;
                    counterScreen.setText(String.valueOf(counter));

                }

//                counter=0;
//                counterScreen.setText(String.valueOf(counter));
            }
        });
    }
}
 */