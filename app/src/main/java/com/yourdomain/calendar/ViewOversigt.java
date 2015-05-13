package com.yourdomain.calendar;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import static com.yourdomain.calendar.ViewIndenfor.støveAf;
import static com.yourdomain.calendar.ViewActivityPlanner.getVal;


public class ViewOversigt extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_oversigt);


        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

       /* Intent intent = getIntent();
        if (intent  != null) {
            intent.getStringExtra(støveAf);
            TextView text = (TextView) findViewById(R.id.textView14);
            text.append(støveAf);
                            */

        //}

      Intent intent2 = getIntent();
        if (intent2  != null) {
            intent2.getStringExtra(getVal);
            TextView text2 = (TextView) findViewById(R.id.textView18);
            text2.append(getVal);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_view_oversigt, menu);
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
}
