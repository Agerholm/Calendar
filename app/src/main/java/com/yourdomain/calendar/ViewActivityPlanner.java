package com.yourdomain.calendar;

import android.content.Intent;
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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_activity_planner);

        Intent intent = getIntent();
        if (null != intent) {
            intent.getStringExtra(støveAf);

            TextView text = (TextView) findViewById(R.id.textView11);
            text.append(støveAf);

            NumberPicker np = (NumberPicker) findViewById(R.id.numberPicker);
            np.setMaxValue(9);
            np.setMinValue(0);

            NumberPicker np2 = (NumberPicker) findViewById(R.id.numberPicker2);
            np2.setMaxValue(9);
            np2.setMinValue(0);

            NumberPicker np3 = (NumberPicker) findViewById(R.id.numberPicker3);
            np3.setMaxValue(9);
            np3.setMinValue(0);

            NumberPicker np4 = (NumberPicker) findViewById(R.id.numberPicker4);
            np4.setMaxValue(9);
            np4.setMinValue(0);


        }
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
        Intent intent = new Intent(this, ViewAdded.class);
        startActivity(intent);

    }
}




