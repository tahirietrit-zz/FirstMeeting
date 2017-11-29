package com.tahirietrit.firstmeeting;

import android.app.Activity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
    EditText someEditText;
    TextView someTextView;
    Button someButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        someEditText = (EditText) findViewById(R.id.some_edittext);
        someTextView = (TextView) findViewById(R.id.some_textview);
        someButton = (Button)  findViewById(R.id.some_button);
        someButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 someTextView.setText(getTextFromEditText());
            }
        });
        someButton.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN){
//                    System.out.println("action down "+ motionEvent.getRa);
                }else if(motionEvent.getAction() == MotionEvent.ACTION_UP) {

                } else if(motionEvent.getAction() == MotionEvent.ACTION_MOVE){

                }else if(motionEvent.getAction() == MotionEvent.ACTION_CANCEL){

                }
                return false;
            }
        });

        System.out.println("on create");
    }
    private String getTextFromEditText(){
        return someEditText.getText().toString();
    }

    @Override
    protected void onStart() {
        super.onStart();
        System.out.println("on start");
    }

    @Override
    protected void onPause() {
        super.onPause();
        System.out.println("on pause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        System.out.println("on resume");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        System.out.println("on destroy");
    }
}
