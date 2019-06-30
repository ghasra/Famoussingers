package bh.ahlia.edu.famoussingers;


import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {


    private MediaPlayer mp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mp = MediaPlayer.create(this,R.raw.theshowmustgoon);
        mp.start();

    }


    public void openWS(View v){
        String url = "https://www.celinedion.com";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);

    }


    public void openFB(View v){
        String url = "https://www.facebook.com/celinedion";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);

    }






}
