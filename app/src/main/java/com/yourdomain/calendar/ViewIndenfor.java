package com.yourdomain.calendar;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;


public class ViewIndenfor extends ActionBarActivity {

    public static String støveAf = "Støvsuge";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_indenfor);


        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_view_indenfor, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
     //Activity chosen and intent sent to the Activity Planner. (With the numberpicker).
    public void støvsuge(View view){
            Intent intent = new Intent(this, ViewActivityPlanner.class);
        intent.putExtra(støveAf, støveAf);
            startActivity(intent);
        }

    public void lyd (View v){
    MediaPlayer mp = MediaPlayer.create(this, R.raw.optagelse);
    mp.start();
    }



}
