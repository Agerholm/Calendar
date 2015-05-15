package com.yourdomain.calendar;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


import static com.yourdomain.calendar.ViewIndenfor.støveAf;


public class ViewActivityPlanner extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_activity_planner);


        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_view_activity_planner, menu);
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

    public void tilføj(View view) {
       Intent intent2 = new Intent(this, ViewOversigt.class);
       intent2.putExtra(støveAf,støveAf);


        Intent intent = new Intent(this, ViewAdded.class);

        startActivity(intent);

        }
    public void twenty(View view){
        Toast.makeText(this,"Varighed sat til 20 minutter",Toast.LENGTH_SHORT).show();
    }


    public void ten(View view){
        Toast.makeText(this,"Varighed sat til 10 minutter",Toast.LENGTH_SHORT).show();
    }
}




