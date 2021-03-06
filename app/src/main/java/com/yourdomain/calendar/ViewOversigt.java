package com.yourdomain.calendar;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import static com.yourdomain.calendar.ViewIndenfor.støveAf;



public class ViewOversigt extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_oversigt);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        Intent intent = getIntent();
        if (intent != null) {
            intent.getStringExtra(støveAf);
            TextView text = (TextView) findViewById(R.id.textView14);
            text.append(støveAf);
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

    public void check(View view){
        Toast.makeText(this,"Aktiviteten er gennemført!",Toast.LENGTH_LONG).show();

    }


    public void uncheck(View view){
        Toast.makeText(this,"Aktiviteten er annulleret",Toast.LENGTH_LONG).show();
    }
}
