package com.diganth.portfolio.appportfolio;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
}

    public void sendMessage(View view) {
        switch (view.getId()) {
            case R.id.firstApp:
                showToast("Spotify Streamer");
                break;
            case R.id.secondApp:
                showToast("Scores App");
                break;
            case R.id.thirdApp:
                showToast("Library App");
                break;
            case R.id.fourthApp:
                showToast("Build it bigger");
                break;
            case R.id.fifthApp:
                showToast("Bacon Reader");
                break;
            case R.id.finalApp:
                showToast("Capstone: My own app");
                break;
            default:
                break;
        }
    }

    protected void showToast(String Message){

        Toast toast = Toast.makeText(getApplicationContext(),"This button will launch " + Message, Toast.LENGTH_SHORT );
        toast.setGravity(Gravity.BOTTOM, 0, -20);
        toast.show();
    }
}
