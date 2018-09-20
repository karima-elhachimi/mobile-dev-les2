package be.ap.karima.les2;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import android.view.View;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    private TextView mTextView;
    private Button btn;
    private Button listBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTextView =(TextView) findViewById(R.id.textView);
        btn = (Button) findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startTask(v);
            }
        });

        listBtn = (Button) findViewById(R.id.listButton);
        listBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                goToList(v);
            }
        });


    }

    public void startTask (View view) {
        // Put a message in the text view
        mTextView.setText("Napping... ");

        // Start the AsyncTask.
        // The AsyncTask has a callback that will update the text view.
        new SimpleAsyncTask(mTextView).execute();
    }

    public void goToList(View view){
        Intent intent = new Intent(this, ListActivity.class);
        startActivity(intent);
    }





}



