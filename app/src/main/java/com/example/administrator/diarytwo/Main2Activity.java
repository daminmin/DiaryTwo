package com.example.administrator.diarytwo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;

public class Main2Activity extends AppCompatActivity {

    private EditText message;
    private Button donebutton;

    public static final String MESSAGE="MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        this.initView();
    }

    private void initView() {
        message = (EditText) this.findViewById(R.id.edit_message);
        donebutton = (Button) this.findViewById(R.id.done_button);
    }

    public void postmessage(View view) {
        Intent intent = new Intent(this,MainActivity.class);
        String messagedata = message.getText().toString();
        intent.putExtra(MESSAGE, messagedata);
        this.startActivity(intent);
    }
}