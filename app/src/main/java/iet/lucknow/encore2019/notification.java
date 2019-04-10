package iet.lucknow.encore2019;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class notification extends AppCompatActivity {



    public static String title, message, info;
    public TextView note;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);

       TextView note=(TextView)(findViewById(R.id.note));
       note.setText(title);

    }
}
