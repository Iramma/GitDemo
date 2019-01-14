package com.foodcourt.user.incrementdecrement;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button decrease, increase;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        increase = findViewById(R.id.increase);
        decrease = findViewById(R.id.decrease);

        increase.setOnClickListener(this);
        decrease.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.increase:
                increase.setVisibility(View.GONE);
                decrease.setVisibility(View.VISIBLE);
                break;

            case R.id.decrease:
                decrease.setVisibility(View.GONE);
                increase.setVisibility(View.VISIBLE);
                break;

        }
    }
}
