package be.ap.karima.les2;

import android.os.AsyncTask;
import android.widget.TextView;

import java.util.Random;

/**
 * Created by yuakarima on 20/09/2018.
 */

public class SimpleAsyncTask extends AsyncTask <Void, Void, String> {


    TextView mTextView;

    public SimpleAsyncTask(TextView tv) {
        mTextView = tv;
    }


    @Override
    protected String doInBackground(Void... voids) {
        Random r = new Random();
        int rdmNumber = r.nextInt(11);
        int s = rdmNumber * 100;

        try {
            Thread.sleep(s);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return "Awake at last after sleeping for "+ s + " milliseconds";
    }

    @Override
    protected void onPostExecute(String result) {
        mTextView.setText(result);
    }
}
