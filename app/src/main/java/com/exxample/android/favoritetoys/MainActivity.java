package com.exxample.android.favoritetoys;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView toyView ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toyView = (TextView) findViewById(R.id.tv_toy_names);
        //toyView.setText("");
        for(String toyNames : ToyBox.getToyNames()){
            String prevText =toyView.getText().toString();
            toyView.setText(prevText+"\n\n\n"+toyNames);
        }

    }
}
