package com.example.matala3ex1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int c = 0;
    int c2 = 0;
    int c3 = 0;
    TextView tx1, tx2, ahoz, tf;
    int x, x2;
    Button b;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b = findViewById(R.id.bnumber);
        tx1 = findViewById(R.id.t1);
        tx2 = findViewById(R.id.t2);
        ahoz = findViewById(R.id.tahoz);
        tf = findViewById(R.id.t3);
    }








    public void PressForNum(View view) {
        c2++;
        c = 0;
        x = (int) (Math.random() * 10 + 0);
        x2 = (int) (Math.random() * 10 + 0);
        tx1.setText(x + "");
        tx2.setText(x2 + "");
        tf.setText("True/False");
    }

    public void clear(View view) {
        c2 = 0;
        c3 = 0;
        ahoz.setText("0/0");
    }

    public void shave(View view) {
        c++;
        if (x == x2) {
            ahoz.setText("true");
            if (c == 1)
                c3++;
        } else ahoz.setText("false");
        ahoz.setText(c3 + "/" + c2);


    }

    public void gadol(View view) {
        c++;
        if (x < x2) {
            ahoz.setText("true");
            if (c == 1)
                c3++;
        } else ahoz.setText("false");
        ahoz.setText(c3 + "/" + c2);


    }

    public void katan(View view) {
        c++;
        if (x > x2) {
            ahoz.setText("true");
            if (c == 1)
                c3++;
        } else ahoz.setText("false");
        ahoz.setText(c3 + "/" + c2);

    }
}
