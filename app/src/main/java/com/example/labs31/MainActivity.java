package com.example.labs31;

import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.textView = findViewById(R.id.textView);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.example_menu, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        ConstraintLayout background=findViewById(R.id.main);
        switch (item.getItemId()){
            case R.id.blue:
                background.setBackgroundColor(Color.BLUE);
                this.textView.setText("Blue");
                return true;

            case R.id.green:
                background.setBackgroundColor(Color.GREEN);
                this.textView.setText("Green");
                return true;
            case R.id.red:
                background.setBackgroundColor(Color.RED);
                this.textView.setText("Red");

                return true;

            case R.id.yellow:
                background.setBackgroundColor(Color.YELLOW);
                this.textView.setText("Yellow");
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
