package com.lesnyg.edu.checkradiobutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        TextView textView;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onclickwiget(View view){
        int id=view.getId();
        String text = ((RadioButton)view).getText().toString();

        switch (id){
            case R.id.radioButton01:
                text = text+"-"+((RadioButton)view).isChecked();
                break;
            case R.id.radioButton02:
                text = text+"-"+((RadioButton)view).isChecked();
                break;
            default:
                text = "Nothing";
        }
        //Toast.makeText(view.getContext(),text,Toast.LENGTH_SHORT).show();
        
    }
}
