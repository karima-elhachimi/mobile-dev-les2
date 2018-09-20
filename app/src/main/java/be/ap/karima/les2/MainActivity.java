package be.ap.karima.les2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import android.view.View;

public class MainActivity extends AppCompatActivity {

    private TextView mTextView;
    private Button btn;
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
    }

    public void startTask (View view) {
        // Put a message in the text view
        mTextView.setText("Napping... ");

        // Start the AsyncTask.
        // The AsyncTask has a callback that will update the text view.
        new SimpleAsyncTask(mTextView).execute();
    }


}
