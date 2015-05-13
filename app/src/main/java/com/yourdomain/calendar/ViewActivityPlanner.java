package com.yourdomain.calendar;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View.OnClickListener;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.NumberPicker;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.view.ViewGroup.LayoutParams;

import org.w3c.dom.Text;

import static com.yourdomain.calendar.ViewIndenfor.støveAf;


public class ViewActivityPlanner extends ActionBarActivity {

    NumberPicker np;
    public static String getVal;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_activity_planner);


        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        Intent intent = getIntent();
        if (null != intent) {
            intent.getStringExtra(støveAf);

            TextView text = (TextView) findViewById(R.id.textView11);
            text.append(støveAf);

            np = (NumberPicker) findViewById(R.id.numberPicker);
            np.setMaxValue(99);
            np.setMinValue(10);


        }
    }


    int dur = np.getValue();

    public String getVal(){

        return Integer.toString(dur);
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
     //   intent2.putExtra(støveAf,støveAf);
        intent2.putExtra(getVal,getVal);

        Intent intent = new Intent(this, ViewAdded.class);

        startActivity(intent);
    }

}




