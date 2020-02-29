package cn.jkdev.androiddemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import static cn.jkdev.androiddemo.R.*;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.andriod02);

        TextView textOne = findViewById(id.text_one);
        textOne.setText("text_onetext_onetext_onetext_onetext_onetext_one");
        textOne.setOnClickListener(new View.OnClickListener() {
            //1 OnClick
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "点击了texOne", Toast.LENGTH_SHORT).show();
            }
        });

        TextView textTwo = findViewById(id.text_two);
        textTwo.setText("textTwo");
        //2.onclick
        textTwo.setOnClickListener(this);

        TextView textThree = findViewById(id.text_two);
        textThree.setText("textThree");
        textThree.setBackgroundColor(getResources().getColor(color.colorAccent));

        Button button = findViewById(id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "点击了textTwo", Toast.LENGTH_SHORT).show();
                Log.d("MainActivity", "hksada");
            }
        });


    }
    @Override
    public void onClick(View view) {
        int id = view.getId();

        if(id == R.id.text_two) {
            Toast.makeText(MainActivity.this, "点击了textTwo", Toast.LENGTH_SHORT).show();
        }


    }
}
