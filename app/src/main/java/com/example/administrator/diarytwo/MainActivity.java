package com.example.administrator.diarytwo;

/*import android.annotation.TargetApi;
import android.icu.util.Calendar;*/
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView diary;
    //private TextView month;
    //private TextView day;

    //private int mMonth;
    //private int mDay;

    //@TargetApi(Build.VERSION_CODES.N)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn=(Button)findViewById(R.id.add_button);
        btn.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Main2Activity.class);
                startActivity(intent);
            }
        });

        this.initView();
        Intent intent = this.getIntent();
        String data = intent.getStringExtra(Main2Activity.MESSAGE);
        diary.setText(data);

        /*Calendar c=Calendar.getInstance();
        mMonth=c.get(Calendar.MONTH);
        mDay=c.get(Calendar.DAY_OF_MONTH);

        month=(TextView)findViewById(R.id.month);
        day=(TextView)findViewById(R.id.day);

        month.setText(new StringBuilder().append(mMonth));
        day.setText(new StringBuilder().append("|  ").append(mDay).append("  |"));*/
        }
    private void initView() {
        diary = (TextView) this.findViewById(R.id.textView1);
    }
}
